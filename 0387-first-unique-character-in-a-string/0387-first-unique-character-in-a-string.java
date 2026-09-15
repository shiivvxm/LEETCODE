class Solution {
    public int firstUniqChar(String s) {
        
        int[] count = new int[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}