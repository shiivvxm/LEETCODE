class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
         int volume = 0;
         int max =0;
        while(left<right){
           int h = Math.min(height[left],height[right]);
            int width = right - left;
             volume = h*width;
             max = Math.max(volume,max);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return max;        
    }
}