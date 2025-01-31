package Queues;


import java.util.Deque;
import java.util.LinkedList;

public class DoubleEndedQue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();


        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);


        System.out.println(dq);
        dq.addFirst(23);
        System.out.println(dq);
//        dq.removeLast();
        dq.add(3);
        System.out.println(dq);

//        dq.removeFirstOccurrence(3);
        dq.removeLastOccurrence(3);

        System.out.println(dq);




    }
}
