class Solution {
    public int[] singleNumber(int[] nums) {
        
        int n = nums.length;

        int xor = 0;
        for(int i =0;i<n;i++){
            xor = xor^nums[i];
        }

        int rsb = xor & ~(xor-1);

        int x=0,y=0;

        for(int i=0;i<n;i++){
            if((nums[i]&rsb) == 0){
                x=x^nums[i];
            }else{
                y=y^nums[i];
            }
        }

        return new int[]{x,y};

    }
}