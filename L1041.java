package Leetcode;

public class L1041 {
    public boolean isRobotBounded(String instructions) {
        //define direction distances: north (0), east (1), south (2), west (3)
        int[][] distance = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        //define direction
        int direction = 0;

        //define coordinates
        int x = 0, y = 0;

        for(int i = 0; i < instructions.length(); i++){
            char cr = instructions.charAt(i);
            if(cr == 'L') direction = (direction + 3) % 4;
            else if(cr == 'R') direction = (direction + 1) % 4;
            else {
                x += distance[direction][0];
                y += distance[direction][1];
            }
        }

        //return true if go back to initial point or face not north
        return ((x == 0 && y == 0) || direction != 0);
    }
}
