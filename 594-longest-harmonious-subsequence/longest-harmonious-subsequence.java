class Solution {
    public int findLHS(int[] nums) {
        


         Arrays.sort(nums);

        int i=0,j=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,res=0;

        while(i<nums.length && j<nums.length){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[j]);

            if((max-min)==1){
                res=Math.max(res,j-i+1);
                max=Integer.MIN_VALUE;
                j++;
            }else if((max-min)==0){
                j++;
            }else{
                min=Integer.MAX_VALUE;
                i++;
            }
        }
        return res;
    }
}