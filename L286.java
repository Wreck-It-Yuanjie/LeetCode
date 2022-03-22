package Leetcode;

import java.util.*;

class L286 {
    // DFS
//    public void wallsAndGates(int[][] rooms) {
//        for(int i = 0; i < rooms.length; i++){
//            for(int j = 0; j < rooms[i].length; j++){
//                if(rooms[i][j] == 0){
//                    dfs(i, j, 0, rooms);
//                }
//            }
//        }
//    }
//
//    // dfs helper function
//    private void dfs(int i, int j, int count, int[][] rooms){
//        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[i].length || count > rooms[i][j]){
//            return;
//        }
//        rooms[i][j] = count;
//
//        dfs(i + 1, j, count + 1, rooms); //right
//        dfs(i - 1, j, count + 1, rooms); //left
//        dfs(i, j + 1, count + 1, rooms); //down
//        dfs(i, j - 1, count + 1, rooms); // up
//    }
    // BFS
    // BFS
    List<int[]> direction = Arrays.asList(
            new int[] {1, 0}, new int[] {-1, 0},
            new int[] {0, 1}, new int[] {0, -1}
    );

    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                if(rooms[i][j] == 0){
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int row = point[0];
            int col = point[1];

            for(int[] dic : direction){
                int rowNext = row + dic[0];
                int colNext = col + dic[1];

                if(rowNext < 0 || rowNext >= rooms.length || colNext < 0 || colNext >= rooms[rowNext].length || rooms[rowNext][colNext] != Integer.MAX_VALUE)
                {
                    continue;
                }

                rooms[rowNext][colNext] = rooms[row][col] + 1;

                queue.add(new int[]{rowNext, colNext});
            }

        }
    }
}
