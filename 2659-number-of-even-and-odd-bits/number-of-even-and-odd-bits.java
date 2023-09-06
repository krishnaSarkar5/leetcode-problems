class Solution {
    public int[] evenOddBit(int n) {
        
        int e=0,o=0,p=0;

        while(n>0){
            if((n&1)!=0){
                if((p&1)==0) e++;
                else o++;
            }
            n=n>>1;
            p++;
        }
        return new int[]{e,o};

    }
}