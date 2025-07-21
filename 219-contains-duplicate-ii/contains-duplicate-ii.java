class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<>();

        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {

            if (Math.abs(i - j) <= k) {

                if (temp.containsKey(nums[j])) {
                    int pos = temp.get(nums[j]);
                    if (pos >= i) {
                        return true;
                    } else {
                        temp.put(nums[j], j);
                    }

                } else {
                    temp.put(nums[j], j);
                }

                j++;
            } else {
                i++;
            }

        }

        return false;
    }
}