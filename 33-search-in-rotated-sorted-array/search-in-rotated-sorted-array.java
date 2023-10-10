class Solution {
    public int search(int[] nums, int target) {
        
        
        int n = nums.length;


        int pivot = findPivot(nums, n);

        if (target >= nums[0] && target <= nums[pivot]) {
           return binarysearch(nums, 0, pivot, n, target);
        } else {
           return binarysearch(nums, pivot+1, n - 1, n, target);
        }


    }



   static int findPivot(int[] arr, int n) {

        int s = 0, e = n - 1;

        while (s <= e) {

            if (s == e) {
                return s;
            }

            int m = s + (e - s) / 2;

            if (m + 1 < n && arr[m] > arr[m + 1]) {
                return m;
            }

            else if (m - 1 >= 0 && arr[m] < arr[m - 1]) {
                return m - 1;
            }

            else if (arr[s] > arr[m]) {
                e = m - 1;

            } else {
                s = m + 1;
            }

        }

        return -1;
    }

    static int binarysearch(int[] arr, int s, int e, int n, int target) {

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        return -1;
    }
}