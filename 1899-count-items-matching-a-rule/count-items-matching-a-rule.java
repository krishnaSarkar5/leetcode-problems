class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int rule = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        int n = items.size();

        int count =0;

        for(int i=0; i<n; i++){

            if(items.get(i).get(rule).equals(ruleValue))
                count++;

        } 

        return count;

    }
}