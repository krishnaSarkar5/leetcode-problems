class Solution {
    public int differenceOfSum(int[] nums) {
        
        int n = nums.length;

        int elementSum = 0, digitSum=0;

        for(int i=0; i<n; i++){

            elementSum += nums[i];

            digitSum += digitSum(nums[i]);

        }

        int result = digitSum - elementSum;

        return result < 0 ? 0 - result : result;


    }

    

    public static int digitSum(int digit){

        int sum = 0;

        while(digit>0){
            int rem = digit%10;
            digit /= 10;
            sum += rem;
        }

        return sum;

    }


}