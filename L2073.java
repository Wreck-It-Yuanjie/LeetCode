package Leetcode;

import java.util.*;

class L2073 {
    // queue
//    public int timeRequiredToBuy(int[] tickets, int k) {
//        Queue<Integer> queue = new LinkedList<>();
//
//        int count = tickets[k];
//
//        int time = 0;
//
//        int index = k;
//
//        for(int ticket : tickets){
//            queue.add(ticket);
//        }
//
//        while(count > 0 && !queue.isEmpty()){
//
//            if(index == 0){
//                count --;
//            }
//
//            if(queue.peek() - 1 > 0){
//                queue.add(queue.remove() - 1);
//            }
//            else{
//                queue.remove();
//            }
//
//            time++;
//
//            if(!queue.isEmpty()) index = (index - 1 + queue.size()) % queue.size();
//            else break;
//
//            // System.out.println("index: " + index + "; count: " + count + "; time: " + time + "; queue: " + queue.peek());
//        }
//        return time;
//    }
    // one iteration
    public int timeRequiredToBuy(int[] tickets, int k) {

        int result = 0;

        for(int i = 0; i < k + 1; i++){
            result += Math.min(tickets[i], tickets[k]);
        }

        for(int j = k + 1; j < tickets.length; j++){
            result += Math.min(tickets[j], tickets[k] - 1);
        }

        return result;
    }
}
