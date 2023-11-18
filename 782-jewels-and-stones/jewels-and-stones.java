class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int len = stones.length();
        int count =0;

        for(int i=0; i<len; i++){
            if(jewels.contains(""+stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}