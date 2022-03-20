package Leetcode;

import java.util.*;

class L225 {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public L225() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    private void helper1(){
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
    }

    public int pop() {
        int answer;
        helper1();

        answer = q1.remove();

        Queue<Integer> q3 = new LinkedList<>();
        q3 = q1;
        q1 = q2;
        q2 = q3;

        return answer;
    }

    public int top() {
        int answer;
        helper1();

        answer = q1.peek();

        q2.add(q1.remove());

        Queue<Integer> q3 = new LinkedList<>();
        q3 = q1;
        q1 = q2;
        q2 = q3;

        return answer;
    }

    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
