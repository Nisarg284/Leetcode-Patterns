package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class StackQ{
        Queue<Integer> q = new LinkedList<>();

        public void push(int val)
        {
            q.add(val);
            for(int i=0;i<q.size()-1;i++)
            {
                q.add(q.remove());
            }

        }

        public int pop()
        {
            if(q.isEmpty())
            {
                System.out.println("Stack is Empty!");
                return -1;
            }
//            for(int i=0;i<q.size()-1;i++)
//            {
//                q.add(q.remove());
//            }
            return q.remove();
        }

        public int peek()
        {
            if(q.isEmpty())
            {
                System.out.println("Queue is Empty!!");
                return -1;
            }

//            for(int i=0;i<q.size()-1;i++)
//            {
//                q.add(q.remove());
//            }
//
//            int val = q.remove();
//            q.add(val);


            return q.peek();
        }

        public void display()
        {
            if(q.isEmpty())
            {
                System.out.println("Queue is Empty Nothing to Display!");
                return;
            }

            for(int i=0;i<q.size();i++)
            {
                int val = q.remove();
                q.add(val);
                System.out.print(val+" ");

            }
            System.out.println();
        }

        public boolean isEmpty()
        {
            return q.isEmpty();
        }

        public int size()
        {
            return q.size();
        }
    }
    public static void main(String[] args) {
        StackQ st = new StackQ();

        st.push(10);
        st.push(40);
        st.display();
        st.pop();
        st.display();
        st.push(50);
        st.push(60);
        st.display();
        System.out.println("Is Empty function: "+st.isEmpty());
        System.out.println("Size: "+st.size());

        int val = st.pop();
        st.display();
    }
}
