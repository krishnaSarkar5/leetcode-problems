class Solution {
    public int mySqrt(int x) {
        

        long s = 0, e = x, ans = 0;

        while (s <= e) {

            long m = s + (e - s) / 2;

            if (m * m == x) {
                return (int)m;
            } else if (m * m > x) {
                e = m - 1;
            } else {
                ans = m;
                s = m + 1;
            }

        }

        return (int)ans;


    }
}