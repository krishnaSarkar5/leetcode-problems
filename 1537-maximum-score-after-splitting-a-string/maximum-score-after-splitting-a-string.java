class Solution {
    public int maxScore(String s) {

        int totalOnes = 0 ;

        for(char c : s.toCharArray()){
            if(c=='1')
                totalOnes++;
        }

        int totalZeros = 0;
        int currScore = 0;
        int maxScore = 0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                totalZeros++;
            }else{
                totalOnes--;
            }
    
            maxScore = Math.max(maxScore,totalZeros+totalOnes);

        }

       return maxScore;
    }
}