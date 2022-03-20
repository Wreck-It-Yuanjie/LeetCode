package Leetcode;

import java.util.*;

class L232 {

    int size;

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public L232() {
        size = 0;
    }

    private void helper(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(!s2.isEmpty()){
            return s2.pop();
        }
        else{
            helper();
            return s2.pop();
        }
    }

    public int peek() {
        if(!s2.isEmpty()){
            return s2.peek();
        }
        else{
            helper();
            return s2.peek();
        }
    }

    public boolean empty() {
        if(s1.size() == 0 && s2.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
