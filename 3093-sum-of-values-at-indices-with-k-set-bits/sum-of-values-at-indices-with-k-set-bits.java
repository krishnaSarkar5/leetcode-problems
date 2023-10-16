class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int n = nums.size();
        int sum=0;

        for(int i=0; i<n; i++){

            if(checkKSetBit(i)==k){
                sum += nums.get(i);
            }

        }

        return sum;


    }

    private int checkKSetBit(int val){


        int count = 0;
        while(val>0){
            val = val & (val-1);
            count++;
        }

        return count;
       
    }
}