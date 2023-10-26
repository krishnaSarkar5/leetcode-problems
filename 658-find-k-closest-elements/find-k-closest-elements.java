class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int l = 0, h = arr.length - 1;

        while (h - l >= k) {

            if ((x - arr[l]) > (arr[h] - x)) {
                l++;
            } else {
                h--;
            }

        }

        List<Integer> res = new ArrayList<>();

        for (int i = l; i <= h; i++) {
            res.add(arr[i]);
        }

        return res;

    }
}