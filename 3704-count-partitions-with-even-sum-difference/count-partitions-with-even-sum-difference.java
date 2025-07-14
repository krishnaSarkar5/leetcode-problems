class Solution {
    public int countPartitions(int[] nums) {
        
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        return sum%2==0 ? nums.length - 1 : 0 ;
    }
}