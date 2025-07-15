class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroIndex = -1;
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                product *= nums[i];
            } else if (zeroIndex != -1) {
                return res;
            } else {
                zeroIndex = i;
            }

        }

        if(zeroIndex != -1){
            res[zeroIndex] = product;
            return res;
        }

        for (int i = 0; i < nums.length; i++) {

            res[i] =  product/nums[i];

        }
        return res;
    }
}