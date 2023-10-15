class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // int n = nums.length;
        // int[] ans = new int[n];

        // for(int i=0; i<n; i++){

        //     int count = 0;
        //     for(int j=0; j<n; j++){

        //         if(nums[j]<nums[i]){
        //             count++;
        //         }

        //     }
        //     ans[i]=count;
        // }

        // return ans;

        int n = nums.length;

        int[] temp = new int[101];
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            temp[nums[i]]++; 
        }

        for(int i=1; i<=100; i++){
            temp[i] += temp[i-1]; 
        }

        for(int i=0; i<n; i++){
            int val = nums[i];

            ans[i] = val==0 ? 0 : temp[val-1]; 
        }

        return ans;

        
    }
}