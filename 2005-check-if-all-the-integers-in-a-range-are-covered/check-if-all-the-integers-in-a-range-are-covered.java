class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        int[] arr =new int[52];
        for(int i=0; i<ranges.length;i++){
            int s = ranges[i][0];
            int e = ranges[i][1];
            arr[s]++;

            if(e+1<arr.length){
                arr[e+1]--;
            }
        }

        int pref = 0;
        for(int i=0;i<=51;i++){
            pref += arr[i];
            if(i>=left && i <= right && pref<=0){
                return false;
            }
        }
        return true;
    }
}