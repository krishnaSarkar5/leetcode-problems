class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int n = nums.length;

        int[] ans = new int[n];

        for(int i=0; i<n; i++){

            int idx = index[i];

            int val = nums[i];

            insert(ans,n,idx,val);

        }

        return ans;
        
    }

    private void insert(int[] arr,int n,int i, int val){

        for(int j=n-1; j>i; j--){
            arr[j]=arr[j-1];
        }
        arr[i]=val;

    }
}