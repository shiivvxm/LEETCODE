class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            int digit = 0;
            int sum = 0;
            while(n>0){
                 digit = n%10;
                sum  = sum+digit;
                n = n/10;
                }
                 if(sum == i){
                    return i;

            }
        }
        return -1;
    }
}