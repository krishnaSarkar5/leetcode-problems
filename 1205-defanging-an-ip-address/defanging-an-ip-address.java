class Solution {
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        int len = address.length();

        for(int i=0; i<len; i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }

        return sb.toString();
        
    }
}