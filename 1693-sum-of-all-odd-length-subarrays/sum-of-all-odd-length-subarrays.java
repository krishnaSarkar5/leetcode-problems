class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum = 0;

        for(int i=0; i<arr.length;i++){
            int left = i+1;
            int leftOdd = left/2;
            int leftEven = left - leftOdd;

            int right = arr.length - i;
            int rightOdd = right/2;
            int rightEven = right - rightOdd;
            int count = leftOdd*rightOdd + leftEven*rightEven;
            sum += arr[i]*count;


        }

        return sum;

    }
}