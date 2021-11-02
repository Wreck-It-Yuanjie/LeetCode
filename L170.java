import java.util.*;

class TwoSum {
    /*Hashtable*/
    private int len;
    private HashMap <Integer, Integer> numbercounts;

    public TwoSum() {
        this.len = 0;
        this.numbercounts = new HashMap<Integer, Integer>();
    }

    public void add(int number) {
        this.numbercounts.put(number, this.numbercounts.getOrDefault(number, 0) + 1);
        this.len ++;
    }

    public boolean find(int value) {
        int[] result = new int[2];
        for(int num: this.numbercounts.keySet()){
            int comp = value - num;
            if(this.numbercounts.containsKey(comp) && this.len > 1){
                if(num == comp && this.numbercounts.get(comp) == 1){
                    continue;
                }
                else{
                    return true;
                }

            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */