class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> temp = new HashMap<>();

        temp.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = k == 0 ? sum : sum % k;
            if (temp.containsKey(mod)) {
                if (i - temp.get(mod) >= 2) {
                    return true;
                }

            } else {
                temp.put(mod, i);
            }
        }
        return false;
    }
}