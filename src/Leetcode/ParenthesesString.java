package Leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

public class ParenthesesString {

    public static boolean isValidString(String brc , String lock)
    {
        if(brc.length() < 2)
        {
            return false;
        }

        Stack<Character> st = new Stack<>();

        for(int i=0;i<brc.length();i++)
        {
            char ch = brc.charAt(i);
            char lc = lock.charAt(i);
            // opening cases:
            if(ch == '(')
            {
                if(!st.empty() && lc == '0')
                {
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
            // closing cases:
            else {
                if(st.empty() && lc == '1')
                {
                    return false;
                }
                else if(!st.empty())
                {
                    st.pop();
                } else if (st.empty() && lc == '0') {
                    st.push(ch);
                }

            }
        }

        return st.isEmpty();
    }

    public static int maxOperations(int[] arr, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int need = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            need = k - arr[i];
            if (hm.containsKey(need) && hm.containsKey(arr[i])) {

                if (hm.get(arr[i]) == 1) {

                    System.out.println(hm.get(arr[i]));
                    hm.remove(arr[i]);
                } else
                {
                    hm.put(arr[i], hm.get(arr[i]) - 1);
                }

                if (hm.get(need) == 1) {
                    System.out.println(hm.get(need));
                    hm.remove(need);
                } else {
                    hm.put(need, hm.get(need) - 1);
                }
                count++;
            }
        }

        return count;
    }

    public static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                st.push(ch);
            }else if(ch == ')' && st.size() > 1){

                sb.append(st.pop());
                sb.append(ch);

            }else{
                st.pop();
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        String brc = "))()))";
        String lock = "010100";

        StringBuilder sb = new StringBuilder(brc);


        HashMap<Integer,Integer> hm = new HashMap<>();


        hm.put(1,hm.getOrDefault(1,0)+1);

        // decrement frequency of key 1
        hm.put(1,hm.get(1)-1);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        System.out.println(removeOuterParentheses("(()())(())(()(()))"));





//        System.out.println(isValidString(brc,lock));

//        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
    }
}
