class Solution {
    public int minimumDifference(int[] nums, int k) {

         if(nums.length==1){
            return 0;
        }

        Arrays.sort(nums);

        int i=0,j=0,dif=Integer.MAX_VALUE;

        while(j<nums.length){

            if(j-i+1==k){
                int temp = nums[j]-nums[i];
                dif = Math.min(dif,temp);
                i++;
                j++;

            }else{
                j++;
            }

        }
        return dif;
    }
}