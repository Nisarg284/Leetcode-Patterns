package Queues;

public class LinkedListImple {

     static class Node{
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

      static class QueueLink{
        static Node head=null;
        static Node tail = null;
        static int size = 0;

        public void add(int val)
        {
            Node newNode = new Node(val);
            if(isEmpty())
            {
                head = tail = newNode;
                size++;
                return;
            }

            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty ");
                return -1;
            }

            int data = head.val;
            head = head.next;
            size--;
            return data;
        }

        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty ");
                return -1;
            }

            return head.val;
        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public void display()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty ");
                return;
            }
            Node temp = head;

            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int size()
        {
            return size;
        }
    }

    public static void main(String[] args) {

        QueueLink myQue = new QueueLink();

        System.out.println(myQue.isEmpty());

        myQue.add(10);
        myQue.add(12);
        myQue.add(78);
        System.out.println("Peek: "+myQue.peek());
        System.out.println("Size: " + myQue.size());
        myQue.display();

        myQue.remove();
        myQue.remove();
        System.out.println("Size: " + myQue.size());



        myQue.display();





    }
}
