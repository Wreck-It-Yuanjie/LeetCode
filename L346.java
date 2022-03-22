package Leetcode;

import java.util.*;

class MovingAverage {

    // List
    private int size;
    private int start;
    private int count;
    private int sum;
    private List<Integer> data;

    public MovingAverage(int size) {
        this.size = size;
        this.start = 0;
        this.count = 0;
        this.sum = 0;
        this.data = new ArrayList<>();
    }

    public double next(int val) {
        if(this.count == this.size){
            sum -= this.data.get(start);
            start++;
            count--;
        }
        data.add(val);
        sum += val;
        count++;

        return sum*1.0/count;
    }

    // Queue
//     int count;
//     int size;
//     int sum;
//     Queue<Integer> data;

//     public MovingAverage(int size) {
//         this.size = size;
//         this.count = 0;
//         this.sum = 0;
//         this.data = new LinkedList<>();
//     }

//     public double next(int val) {
//         if(this.count == this.size){
//             sum -= this.data.poll();
//             count--;
//         }
//         count++;
//         data.add(val);
//         sum += val;
//         return sum*1.0/this.count;
//     }

}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
