class Solution {
    public int sumOddLengthSubarrays(int[] arr) {


        int sum = 0;

        int n = arr.length;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int k = 3;
        while(k<=n){

            int temp = 0;

            for(int i=0; i<k; i++){
                temp += arr[i];
            }

          sum += temp;

            System.out.println("1st "+temp);


            for(int i=k;i<n;i++){

                if((i-k)>=0)
                    temp = (temp-arr[i-k]) + arr[i];
                sum += temp;
            }

             System.out.println("2nd "+temp);

           

            k += 2;

        }

        return sum;
        
    }
}