class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i]= nums[nums[i]];
        }
        return ans;
    }
}


// class Solution {
//     public int[] buildArray(int[] nums) {
//         isPerm(nums, 0);
//         System.gc();
//         return nums;

//     }

//     public void isPerm(int[] nums, int start)
//     {
//         if(start < nums.length)
//         {
//             int temp = nums[start];
//             int result = nums[temp];
//             isPerm(nums, start+1);
//             nums[start] = result;
//         }
//     }
    
// }
