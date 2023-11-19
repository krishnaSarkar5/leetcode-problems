class Solution {
    public String interpret(String command) {
        

        int len = command.length();

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<len; i++){

            if( command.charAt(i) == '('){
                continue;
            }else if(i>0 && command.charAt(i-1) == '(' && command.charAt(i) == ')'){
                sb.append("o");
            }
            else if(command.charAt(i) == ')'){
                 continue;
            }
            
            else{
                sb.append(command.charAt(i));
            }

        }

        return sb.toString();
    }
}