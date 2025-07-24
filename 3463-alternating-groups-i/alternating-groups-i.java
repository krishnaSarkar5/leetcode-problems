class Solution {
    public int numberOfAlternatingGroups(int[] colors) {

        int res = 0;
        
        for(int i=0;i<colors.length;i++){

            int l = i;
            int m = i+1<colors.length?i+1:(i+1)-colors.length;
            int r = i+2<colors.length?i+2:(i+2)-colors.length;

            if(colors[l]==colors[r] && colors[l]!=colors[m]){
                res++;
            }

        }
        return res;
    }
}