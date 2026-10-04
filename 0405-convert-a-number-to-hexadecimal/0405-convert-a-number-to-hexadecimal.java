class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        String hex = "0123456789abcdef";
        StringBuilder ans = new StringBuilder();

        long n = num;

        if (n < 0) {
            n = n + 4294967296L;
        }

        while (n > 0) {
            int rem = (int)(n % 16);
            ans.append(hex.charAt(rem));
            n = n / 16;
        }

        return ans.reverse().toString();
    }
}