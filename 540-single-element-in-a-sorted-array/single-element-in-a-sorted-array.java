class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int s = 0, e = n - 1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (m % 2 == 0) {

                if (m + 1 < n  && nums[m] == nums[m + 1]) {
                    s = m + 2;
                } else if (m - 1 >= 0 && nums[m] == nums[m - 1]) {
                    e = m - 2;
                } else {
                    return nums[m];
                }

            } else {
                if (m - 1 >= 0 && nums[m] == nums[m - 1]) {
                    s = m + 1;
                } else if (m + 1 < n  && nums[m] == nums[m + 1]) {
                    e = m - 1;
                }
            }

        }

        return -1;
    }
}