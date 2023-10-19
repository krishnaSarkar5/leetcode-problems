class Solution {
    public String truncateSentence(String s, int k) {

        String ans = "";

        int count = 0;

        int n = s.length();

        for(int i=0;i<n;i++){

             if(s.charAt(i) == ' '){
                count++;
            }

             if(count==k)
                break;

            ans += s.charAt(i);

           

           

            

        }

        return ans;
        
    }
}