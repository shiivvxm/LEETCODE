class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check majority
        for (int num : map.keySet()) {
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }
}