package Leetcode;

import java.util.*;

class L240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*1. sort the matrix*/
        int index = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] flmatrix = new int[m*n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                flmatrix[index] = matrix[i][j];
                index++;
            }
        }
        Arrays.sort(flmatrix);
        /*2. search the element*/
        int start = 0;
        int end = m*n - 1;
        boolean flag = false;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(flmatrix[mid] < target){
                start = mid + 1;
            }
            else if(flmatrix[mid] > target){
                end  = mid - 1;
            }
            else{
                flag = true;
                break;
            }
        }
        return flag;
    }
}