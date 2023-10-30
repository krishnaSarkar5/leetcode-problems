class Solution {
    public int largestAltitude(int[] gain) {
        
        int hg = 0,g=0;
        int n = gain.length;

        for(int i=0; i<n; i++){

            g += gain[i];

            if(g>hg)
                hg = g;
    
        }

        return hg;

    }
}