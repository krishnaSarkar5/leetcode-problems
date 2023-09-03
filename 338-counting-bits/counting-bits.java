class Solution {
    public int[] countBits(int n) {
        
        int[] a = new int[n+1];

        a[0]=0;
        if(n==0) return a;
        a[1]=1;
         if(n==1) return a;
        a[2]=1;
         if(n==2) return a;
        a[3]=2;
         if(n==3) return a;

        int i = 0 , j = 4;
        int lim = 4;
        while(j<=n){
            a[j] = a[i]+1;
            if(i==lim-1){
                i=0;
                lim = 2*lim;
            }else{
                i++;
            }
            j++;
        }
        return a;

    }
}



// class Solution {
//     public int[] countBits(int n) {
//         int ans[]=new int[n+1];
//         for(int i=1;i<=n;i++){
//             ans[i]=ans[i/2]+i%2;
//         }
//         return ans;
//     }
// }



// class Solution {
//     public int[] countBits(int n) {
//         int arr[]=new int[n+1];
//         helper(arr,1,1);
//         return arr;
//     }

//     void helper(int arr[],int bits,int count)
//     {
//         if(count>=arr.length)
//         return;
//         arr[count]=bits;
//         count<<=1;
//         helper(arr,bits,count);
//         helper(arr,++bits,++count);
//     }
// }
