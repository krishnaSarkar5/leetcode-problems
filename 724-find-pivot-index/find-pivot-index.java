class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] leftArr = new int[len];
        int[] rightArr = new int[len];
        leftArr[0] = nums[0];
         rightArr[len-1] = nums[len-1];
        for(int i=1; i<len; i++){
            leftArr[i] = leftArr[i-1]+nums[i];
            rightArr[len-1-i] = rightArr[len-i]+nums[len-1-i];
        }

        for(int i=0; i<len; i++){
            if(leftArr[i]==rightArr[i])
                return i;
        }

        return -1;

    }
}