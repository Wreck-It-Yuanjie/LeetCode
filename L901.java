package Leetcode;

import java.util.*;

class L901 {

    int index;
    Stack<Integer> stockStack;
    List<Integer> price;
    List<Integer> result;

    public L901() {
        stockStack = new Stack<>();
        price = new ArrayList<>();
        result = new ArrayList<>();
        index = 0;
    }

    public int next(int price) {
        this.price.add(price);

        if(stockStack.isEmpty()){
            result.add(1);
        }
        else if(price < this.price.get(stockStack.peek())){
            result.add(1);
        }
        else{
            while (!stockStack.isEmpty() && price >= this.price.get(stockStack.peek())){
                stockStack.pop();
            }

            if(!stockStack.isEmpty()){
                result.add(index - stockStack.peek());
            }
            else{
                result.add(index + 1);
            }
        }

        stockStack.push(index);
        index ++;

        return result.get(result.size() - 1);
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
