class Solution {
    public int returnToBoundaryCount(int[] nums) {
        
        int sum = nums[0];
        int res = 0;
        for(int i=1;i<nums.length;i++){
            sum += nums[i];
            if(sum==0)
                res++;
        }
        return res;
    }
}