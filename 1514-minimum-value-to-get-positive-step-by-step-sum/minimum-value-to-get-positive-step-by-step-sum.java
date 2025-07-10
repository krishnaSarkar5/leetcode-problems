class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;

        int res = 0;

        for(int i=0; i<nums.length;i++){
            sum += nums[i];
           if(sum<=res){
            res=sum;
           }
                
        }
        return res<0?res*(-1)+1:res+1;
    }
}