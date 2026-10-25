class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int[] children = new int[k];
        return solve(cookies, children, 0);
    }

    private int solve(int[] cookies, int[] children, int index) {
        if (index == cookies.length) {
            int max = 0;
            for (int count : children) {
                max = Math.max(max, count);
            }
            return max;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < children.length; i++) {
            children[i] += cookies[index];

            ans = Math.min(ans, solve(cookies, children, index + 1));

            children[i] -= cookies[index];

            if (children[i] == 0) {
                break;
            }
        }

        return ans;
    }
}