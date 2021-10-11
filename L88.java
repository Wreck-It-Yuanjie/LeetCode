package Leetcode;

class L88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] nums1c = new int[m];
        // system.arraycopy(nums1, 0, nums1c, 0, m);
        for (int j = 0; j < m; j++){
            nums1c[j] = nums1[j];
        }
        for (int i = 0; i < nums1.length; i++){
            /*How to tell p1 p2 out of bound situation?*/
            if(p1 < m && p2 < n){
                if(nums1c[p1] > nums2[p2] || p1 >= m){
                    nums1[i] = nums2[p2];
                    p2 ++;
                }
                else{
                    nums1[i] = nums1c[p1];
                    p1 ++;
                }
            }
            else if(p1 >= m){
                System.out.print("p1 > m");
                nums1[i] = nums2[p2];
                p2 ++;
            }
            else{
                nums1[i] = nums1c[p1];
                p1 ++;
            }
        }
        return nums1;
    }
}