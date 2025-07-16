class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);  

        int currSum = 0, result = 0;
        for (int num : nums) {
            currSum += num;

            result += countMap.getOrDefault(currSum - goal, 0);

            countMap.put(currSum, countMap.getOrDefault(currSum, 0) + 1);
        }
        return result;
    }
}