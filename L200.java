package Leetcode;

import java.util.*;

class L200 {
    // DFS
//    public int numIslands(char[][] grid) {
//        int N = 0;
//
//        if(grid == null || grid.length == 0){
//            return 0;
//        }
//
//        for(int i = 0; i < grid.length; i++){
//            for(int j = 0; j < grid[i].length; j++){
//                if(grid[i][j] == '1'){
//                    N++;
//                    dfsHelper(i, j, grid);
//                }
//            }
//        }
//
//        return N;
//    }
//
//    private void dfsHelper(int i, int j, char[][] grid){
//        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1'){
//            return;
//        }
//
//        grid[i][j] = '0';
//
//        dfsHelper(i + 1, j, grid);
//        dfsHelper(i - 1, j, grid);
//        dfsHelper(i, j + 1, grid);
//        dfsHelper(i, j - 1, grid);
//    }
    // BFS
    public int numIslands(char[][] grid) {

        int N = 0;

        if(grid == null || grid.length == 0) return 0;

        List<int[]> directions = Arrays.asList(
                new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1}
        );

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){

                    N++;

                    Queue<int[]> queue = new LinkedList<>();

                    queue.add(new int[]{i, j});

                    while(!queue.isEmpty()){
                        int[] point = queue.poll();
                        int r = point[0];
                        int c = point[1];

                        grid[r][c] = '0';

                        for(int[] dic : directions){

                            int nextRow = r + dic[0];
                            int nextCol = c + dic[1];

                            if(nextRow < 0 || nextCol < 0 || nextRow >= grid.length || nextCol >= grid[nextRow].length || grid[nextRow][nextCol] != '1'){
                                continue;
                            }

                            grid[nextRow][nextCol] = '0';

                            queue.add(new int[]{nextRow, nextCol});
                        }
                    }
                }
            }
        }


        return N;
    }
}
