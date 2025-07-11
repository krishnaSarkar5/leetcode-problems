class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] arr = new int[101];

        for(int i=0; i<logs.length;i++){
            int si = logs[i][0]-1950;
            int ei = logs[i][1]-1950;

            arr[si] +=1;
            arr[ei] -=1;

            // for(int j=si;j<ei;j++){
            //     arr[j] += 1;
            // }
           
        }

        int year = 0;
        int max = 0;
        int curr = 0;
        for(int i=0; i<arr.length;i++){
            curr += arr[i];

            if(curr>max){
                year = i + 1950;
                max=curr;
            }
        }

        return year;
    }
}