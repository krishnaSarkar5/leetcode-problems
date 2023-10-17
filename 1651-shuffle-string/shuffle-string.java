class Solution {
    public String restoreString(String s, int[] indices) {

        int n = indices.length;

        String[] arr = new String[n];

        String result = "";

        for(int i=0; i<n; i++){
            arr[indices[i]]=""+s.charAt(i);
        }


         for(int i=0; i<n; i++){
            result += arr[i];
        }

        return result;
        
    }
}