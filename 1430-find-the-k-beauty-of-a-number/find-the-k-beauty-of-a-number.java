class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);

        int i = 0, j = 0, res = 0;
        StringBuilder sb = new StringBuilder();

        while (j < s.length()) {
            sb.append(s.charAt(j));

            if (sb.length() == k) {
                Integer n = Integer.parseInt(sb.toString());

                if (n != 0 && num % n == 0) {
                    res++;
                }
                j++;

                sb.deleteCharAt(0);

                i++;
            } else {
                j++;
            }

        }
        return res;
    }
}