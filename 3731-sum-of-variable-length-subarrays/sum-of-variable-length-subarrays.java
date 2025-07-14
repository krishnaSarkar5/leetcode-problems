class Solution {
    public int subarraySum(int[] nums) {
        
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        int totalSum = 0;
        for(int i=0; i<nums.length;i++){
            int element = i==0 ? nums[i] : nums[i] - nums[i-1];
            int start = Math.max(0,i-element);
            int sum = start == 0 ? nums[i] : nums[i] - nums[start-1];
            totalSum += sum;
        }
        return totalSum;
    }
}