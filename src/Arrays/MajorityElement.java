package Arrays;
// leetcode 169: https://leetcode.com/problems/majority-element/

import java.util.HashMap;

public class MajorityElement {
    private static int majorityElement(int[] arr) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        // fill map
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        int majority = 1;
        int key = arr[0];
        for(int i:hm.keySet())
        {
            if(hm.get(i) > majority)
            {
                majority = hm.get(i);
                key = i;
            }

        }
        return key;
    }
    public static void main(String[] args) {
        int[]arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }


}
