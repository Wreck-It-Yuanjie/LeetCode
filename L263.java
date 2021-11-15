package Leetcode;

public class L263 {
    public boolean isUgly(int n) {
        //hashset
//         HashSet<Integer> hashtable = new HashSet<>();
//         hashtable.add(2);
//         hashtable.add(3);
//         hashtable.add(5);

//         int temp = 0;

//         // rethink the conditions
//         while(n != 1){
//             if(temp == n) return false;
//             temp = n;
//             // System.out.println(n);
//             for(int i:hashtable){
//                 if(n%i == 0) n = n/i;
//             }

//         }
//         return true;
        //array
        int temp = 0;
        int[] prime = {2,3,5};

        while(n!=1){
            if(temp == n) return false;
            temp = n;
            for(int i = 0; i < prime.length; i++){
                if(n%prime[i] == 0) n = n/prime[i];
            }
        }
        return true;
    }
}
