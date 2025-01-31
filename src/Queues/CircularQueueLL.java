package Queues;

public class CircularQueueLL {

    static class Node{
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    static class cirQueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val)
        {
            Node newNode = new Node(val);
            if(size == 0)
            {
                head = tail = newNode;
                tail.next = head;
                size++;
                return;
            }

            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
            size++;
        }

        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int val = head.val;
            if(size == 1)
            {
                head = tail = null;
                size--;
                return val;
            }


            val = head.val;
            head = head.next;
            tail.next = head;
            size--;
            return val;
        }

        public int peek()
        {
            if(size == 0)
            {
                System.out.println("Queue is Empty!");
                return -1;
            }

            return head.val;

        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public int size()
        {
            return size;
        }

        public void display(){
            if(isEmpty())
            {
                System.out.println("Queue is Empty nothing to display!");
                return;
            }

            Node temp = head;

            while(temp!=tail)
            {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println(temp.val+" ");

        }
    }

    public static void main(String[] args) {

        cirQueLL myQue = new cirQueLL();
        System.out.println("is Empty: "+myQue.isEmpty());

        myQue.add(10);
        System.out.print("Display function: ");
        myQue.display();
        System.out.println("Size: "+myQue.size());
        myQue.add(23);
        myQue.add(78);
        myQue.remove();
        System.out.print("Display function: ");
        myQue.display();
        System.out.println("Size: "+myQue.size());
        myQue.add(3);
        myQue.add(7);
        myQue.add(213);
        myQue.add(784);
        myQue.add(235);
        myQue.add(708);
        System.out.print("Display function: ");
        myQue.display();
        System.out.println("Size: "+myQue.size());
        System.out.println("is Empty: "+myQue.isEmpty());
        myQue.remove();
        System.out.print("Display function: ");
        myQue.display();
        System.out.println("Size: "+myQue.size());
        System.out.println("is Empty: "+myQue.isEmpty());






    }
}
