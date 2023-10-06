class Solution {
    public int[] shuffle(int[] nums, int n) {

        int l = nums.length;
        
        int[] ans = new int[l];

        int i=0,j=0;

       while(j<l && i<l){

            ans[i]=nums[j];

            ans[i+1]=nums[j+n];

            i=i+2;
            j++;

        }

        return ans;

    }
}