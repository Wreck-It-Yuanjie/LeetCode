package Leetcode;

class L240_new {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*Search space reduction*/
        boolean flag = false;
        int m = matrix.length;
        int n = matrix[0].length;
        int row = m - 1;
        int column = 0;
        while(row >= 0 && column <= n - 1){
            if(matrix[row][column] < target){
                column++;
            }
            else if(matrix[row][column] > target){
                row--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
