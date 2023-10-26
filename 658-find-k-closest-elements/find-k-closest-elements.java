class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
       int n = arr.length;

        int h = lowerBound(arr, x);

        System.out.println("+++++++ " + h);

        int l = h - 1;

        while (k > 0) {

            if (l < 0) {
                h++;
            } else if (h >= n) {
                l--;
            } else if ((x - arr[l]) > (arr[h] - x)) {
                h++;
            } else {
                l--;
            }
            k--;
        }

        List<Integer> res = new ArrayList<>();

        for (int i = l + 1; i < h; i++) {
            res.add(arr[i]);
        }

        return res;

    }



    public static int lowerBound(int[] arr, int target) {

        int s = 0, e = arr.length - 1;

        int ans = 0;

        if (target >= arr[arr.length - 1]) {
            return e;
        } else if (target <= arr[0]) {
            return 0;
        }

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (target <= arr[m]) {
                ans = m;
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }

        }

        return ans;
    }



}