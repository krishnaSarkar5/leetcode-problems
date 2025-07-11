class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] leftPref = new int[nums.length];
        int[] rightPref = new int[nums.length];

        int left = 0;
        int right = 0;

        for(int i=0;i < nums.length;i++){
            left += nums[i];
            right += nums[nums.length-1-i];
            leftPref[i] = left;
            rightPref[nums.length-1-i] = right;
        }
        
        for(int i=0;i<nums.length;i++){
            if(leftPref[i]==rightPref[i]){
             
                return i;
            }
        }
        return -1;
    }
}