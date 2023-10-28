class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<String> s = new HashSet<>();

        int l = allowed.length();

        for(int i=0; i<l; i++){
            s.add(""+allowed.charAt(i));
        }


        int n = words.length;

        int count = 0;

        for(int i=0; i<n; i++){

            String w = words[i];
            
            int len = w.length();

            boolean flag = false;

             for(int j=0; j<len; j++){

                 if(s.contains(""+w.charAt(j))){
                     flag = true;
                 }else{
                     flag = false;
                     break;
                 }

             }


             if(flag){
                 count++;
             }

        }

        return count;

    }
}