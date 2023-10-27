class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        int sum=0;

        for(int i=0;i<n;i++){

            sum += mat[i][i];
            int j = n-1-i;
            if(i!=j)
                sum += mat[i][j];



            // for(int j=0;j<n;j++){

            //     if(i==j || (i+j)==n-1){
            //         sum += mat[i][j];
            //     }

            // }
        }
        return sum;

    }
}