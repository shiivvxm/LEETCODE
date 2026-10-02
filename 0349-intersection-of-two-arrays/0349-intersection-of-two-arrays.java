class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] res = new int[n1];
        int k = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {

                if (nums1[i] == nums2[j]) {

                    // duplicate avoid karne ke liye
                    boolean already = false;

                    for (int x = 0; x < k; x++) {
                        if (res[x] == nums1[i]) {
                            already = true;
                            break;
                        }
                    }

                    if (!already) {
                        res[k] = nums1[i];
                        k++;
                    }

                    break;
                }
            }
        }

        return Arrays.copyOf(res, k);
    }
}
