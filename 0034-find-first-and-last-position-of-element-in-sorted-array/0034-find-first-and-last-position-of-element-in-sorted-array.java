class Solution {
    public int[] searchRange(int[] nums, int target) { 
        return new int[]{ find_first(nums , target),find_last( nums , target)};
    }
    private int find_first( int[]nums , int target){
        int low =0;
        int high = nums.length-1;
        int ans = -1;
        while(low <=high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid+1;
            }
              else if(nums[mid] > target){
                high = mid-1;
              }else{
                ans = mid;
                high = mid-1;
              }
            
        }
        return ans;

    }
    private int find_last( int[]nums , int target){
        int low =0;
        int high = nums.length-1;
        int ans = -1;
        while(low <=high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid+1;
            }
              else if(nums[mid]> target){
                high = mid-1;
              }else{
                ans = mid;
                low = mid+1;
              }
            
        }
        return ans;
    }
}