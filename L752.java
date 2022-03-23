package Leetcode;

import java.util.*;

class L752 {
    // BFS
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));

        Set<String> visited = new HashSet<>();
        visited.add("0000");

        Queue<String> queue = new LinkedList<>();
        queue.add("0000");

        int level = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            while(size > 0){
                String currentPosition = queue.poll();

                visited.add(currentPosition);

                if(currentPosition.equals(target)){
                    return level;
                }

                if(dead.contains(currentPosition)){
                    size--;
                    continue;
                }

                // next step
                for(int i = 0; i < 4; i++){
                    // forward
                    String nextPositionForward = currentPosition.substring(0, i) + ((currentPosition.charAt(i) - '0' + 11)%10 + "") + currentPosition.substring(i + 1);

                    // backward
                    String nextPositionBackward = currentPosition.substring(0, i) + ((currentPosition.charAt(i) - '0' + 9)%10 + "") + currentPosition.substring(i + 1);

                    if(!visited.contains(nextPositionForward) && !dead.contains(nextPositionForward)){
                        queue.add(nextPositionForward);
                        visited.add(nextPositionForward);
                    }
                    if(!visited.contains(nextPositionBackward) && !dead.contains(nextPositionBackward)){
                        queue.add(nextPositionBackward);
                        visited.add(nextPositionBackward);
                    }

                    // System.out.println(queue);
                }

                size --;
            }

            level++;
        }

        return -1;
    }
}