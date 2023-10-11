class Solution {
    public int maximumWealth(int[][] accounts) {

        int cus = accounts.length;
        int max =0;

        for(int i=0; i<cus; i++){

            int b = accounts[i].length;

            int sum = 0;

            for(int j=0; j<b; j++){
                sum += accounts[i][j];
                if(sum>max){
                    max=sum;
                }
            }

        }
        return max;
    }
}