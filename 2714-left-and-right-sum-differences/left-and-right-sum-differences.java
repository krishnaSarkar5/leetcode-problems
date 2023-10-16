class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int totalSum = 0;

        int n = nums.length;

        int[] ans = new int[n];

        int leftSum = nums[0];

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < n; i++) {

            if (i == 0 || i == n - 1) {
                ans[i] = totalSum - nums[i];
                continue;
            }

            int xy = totalSum - nums[i];
            int y = xy - leftSum;
            int diff = Math.abs((y - leftSum));
            ans[i] = diff;

            leftSum += nums[i];

        }

        return ans;

    }
}