package Leetcode;

public class L167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        /*Hashmap*/
//         HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer> ();
//         for(int i = 0; i < numbers.length; i++){
//             hashtable.put(numbers[i], i);
//         }

//         for(int i = 0; i < numbers.length; i++){
//             int comp = target - numbers[i];
//             System.out.println(i);
//             System.out.println(comp);
//             if(hashtable.containsKey(comp) && i != hashtable.get(comp)){
//                 result[0] = i + 1;
//                 result[1] = hashtable.get(comp) + 1;
//                 return result;
//             }
//         }
//         return result;

        /*two pointers*/
        int low = 0; int high = numbers.length - 1;
        while(low < high){
            if(numbers[low] + numbers[high] == target){
                result[0] = low + 1;
                result[1] = high + 1;
                return result;
            }
            else if(numbers[low] + numbers[high] > target){
                high --;
            }
            else{
                low ++;
            }
        }
        return result;
    }
}
