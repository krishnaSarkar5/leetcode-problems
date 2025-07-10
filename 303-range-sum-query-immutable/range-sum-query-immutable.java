class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        int len=nums.length;
        int sum = 0;
        for(int i=0; i<len; i++){
            sum = sum+nums[i];
            nums[i]=sum;
        }
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        return left==0 ? nums[right] : nums[right]-nums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */