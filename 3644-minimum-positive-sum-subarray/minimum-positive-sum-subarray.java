class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int[] prefSum = new int[nums.size()];

        prefSum[0] = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            prefSum[i] = prefSum[i - 1] + nums.get(i);
        }
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < prefSum.length; i++) {

            int l1 = l;
            while (l1 <= r) {
                int e1 = i + l1 - 1;

                int temp1 = Integer.MAX_VALUE;

                if (e1 < prefSum.length) {
                    temp1 = i == 0 ? prefSum[e1] : prefSum[e1] - prefSum[i - 1];
                }

                temp1 = temp1 < 0 ? Integer.MAX_VALUE : temp1;

                if (temp1 > 0) {
                    sum = Math.min(sum, temp1);

                }
                l1++;
            }

        }

        return sum == Integer.MAX_VALUE ? -1 : sum;
    }
}