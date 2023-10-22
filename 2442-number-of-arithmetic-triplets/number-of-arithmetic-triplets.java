class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){

            int tar1 = nums[i] + diff;

            int tar2 = tar1 + diff;

            int ind1 = search(nums,tar1,i+1,n-1);

            int ind2 = search(nums,tar2,i+1,n-1);

            if(ind1 != -1 && ind2 != -1){
                count++;
            }


        }

        return count;


    }



    public static int search(int[] arr, int target,int s,int e){

        while(s<=e){

            int m = s + (e-s)/2;

            if(arr[m]==target){
                return m;
            }

            else if(arr[m]>target){
                e = m-1;
            }else{
                s = m+1;
            }

        }
         return -1;

    }
}