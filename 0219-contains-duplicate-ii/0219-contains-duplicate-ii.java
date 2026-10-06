class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            int prevInd= 0;
            if(map.containsKey(nums[i])){
                 prevInd = map.get(nums[i]);
                  if(i- prevInd <= k){
                return true;
            }
            }
           
            map.put(nums[i],i);
        }
        return false;
    }
}