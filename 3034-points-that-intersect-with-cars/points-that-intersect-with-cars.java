class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] points = new int[102];

        for(List<Integer> coords : nums){
            int s = coords.get(0);
            int e = coords.get(1);
            points[s]++;
            if(e+1<points.length)
            points[e+1]--;
        }

        int res = 0;
        int pref = 0;
        for(int i=0; i<points.length;i++){
            pref += points[i];
            if(pref>0)
                res++;
        }
        return res;
    }
}