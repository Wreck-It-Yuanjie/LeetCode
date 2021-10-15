package Leetcode;

public class L74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int flag = 0;
        int row = matrix.length;
        int column = matrix[0].length;
        int index = 0;
        int start = 0;
        int end = row*column - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int mtrx = matrix[mid/column][mid%column];
            if(mtrx < target){
                start = mid + 1;
            }
            else if (mtrx > target){
                end = mid - 1;
            }
            else{
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
