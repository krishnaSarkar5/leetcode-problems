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