class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int high = 0;

        for(int i=0; i<gain.length;i++){
            start += gain[i];
            high = Math.max(high,start);
        }
        return high;
    }
}