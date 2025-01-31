package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
//        Stack<Integer> st = new Stack<>();
//        while (!q.isEmpty())
//        {
//            st.push(q.remove());
//        }
//
//        while (!st.isEmpty())
//        {
//            q.add(st.pop());
//        }

        if (q.isEmpty()) {
            return;
        }

        int val = q.remove();
        reverse(q);
        q.add(val);
    }

    public static void recur(Queue<Integer> q, int k)
    {
        if(k==0)
        {
            return;
        }
        int val = q.remove();
        recur(q, k-1);
        q.add(val);
    }
    public static void recursion(Queue<Integer> q, int k)
    {
        // call recursive function for reverse first k elements
        recur(q, k);

//        now remove and add elements from queue for q.size() - k times
        int times = q.size() - k;

        while (times > 0) {
            q.add(q.remove());
            times--;
        }

    }

    public static void reverseKElements(Queue<Integer> q, int k) {
        // Define Explicit Stack
        Stack<Integer> st = new Stack<>();

        // add first k elements in stack
        for (int i = 0; i < k; i++) {
            st.add(q.remove());
        }

        // now add stack elements in queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }


//        now remove and add elements from queue for q.size() - k times
        int times = q.size() - k;

        while (times > 0) {
            q.add(q.remove());
            times--;
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);


        System.out.println("Original Queue : " + q);
//        reverseKElements(q, 2);
        recursion(q,3);
        System.out.println("Reverse Queue : " + q);


    }

}
