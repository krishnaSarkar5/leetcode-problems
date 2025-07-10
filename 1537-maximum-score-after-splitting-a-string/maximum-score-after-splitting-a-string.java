class Solution {
    public int maxScore(String s) {

        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1))
             return 1;
            if(s.charAt(0)=='0')
             return 2;

             return 0;
        }

        int[] z = new int[s.length()];
        int[] o = new int[s.length()];

        int sz = 0;
        int so = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sz++;
            }
             if(s.charAt(s.length()-1-i)=='1'){
                so++;
            }
            z[i]=sz;
            o[s.length()-1-i]=so;

        }
            int res =  0;
         for(int i=1;i<s.length()-1;i++){
            res =  Math.max(res,z[i]+o[i]);

        }
        return res;
    }
}