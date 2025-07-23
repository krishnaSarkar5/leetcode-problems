class Solution {
    public int minimumRecolors(String blocks, int k) {

        int res = blocks.length();

        int i = 0, j = 0, w = 0, b = 0;

        while (j < blocks.length()) {

            if (blocks.charAt(j) == 'W') {
                w++;
            } else {
                b++;
            }

            if (j - i + 1 == k) {
                res = Math.min(res, w);

                if (blocks.charAt(i) == 'W') {
                    w--;
                } else {
                    b--;
                }
                i++;
                j++;
            } else {

                j++;
            }
        }
        return res;

    }
}