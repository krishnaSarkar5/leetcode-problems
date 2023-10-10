class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int n = row * col;

        int s = 0, e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            int rowIndex = mid / col;
            int colIndex = mid % col;

            int currentValue = matrix[rowIndex][colIndex];

            if (currentValue == target) {
                return true;
            } else if (currentValue > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return false;
    }
}