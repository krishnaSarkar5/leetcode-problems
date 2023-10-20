class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String s1 = "";
        String s2= "";

        int n1 = word1.length;
        int n2 = word2.length;

        for(int i=0;i<n1;i++){
            s1 += word1[i];
        }

        for(int i=0;i<n2;i++){
            s2 += word2[i];
        }

        return s1.equals(s2) ;

    }
}