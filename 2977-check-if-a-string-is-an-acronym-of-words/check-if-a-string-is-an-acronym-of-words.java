class Solution {
    public boolean isAcronym(List<String> words, String s) {

        int wl = words.size();
        int sl =  s.length();

        if(wl!=sl){
            return false;
        }

        for(int i=0; i<wl; i++){

            Character  val1 = words.get(i).charAt(0);

            Character  val2 = s.charAt(i);

            if(!val1.equals(val2)){
                return false;
            }

        }

        return true;

        
    }
}