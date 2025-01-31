package LinkedList;

public class Implementation {

    static class Node{
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val)
        {
            Node newNode  = new Node(val);
            if(size == 0)
            {
                head = tail = newNode;
                size++;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public void addFirst(int val)
        {
            if(size == 0)
            {
                size++;
                add(val);
                return;
            }

            Node newNode = new Node(val);
            newNode.next = head;
            size++;
            head = newNode;
        }

        public int remove()
        {
            if(size == 0)
            {
                return -1;
            }

            if(size == 1)
            {
                int val = head.val;
                head = tail = null;
                size = 0;
                return val;
            }

            Node temp = head;

            while(temp.next!=tail)
            {
                temp = temp.next;
            }

            int val = tail.val;

            tail = temp;
            tail.next =null;
            return val;
        }

        public int removeFirst()
        {
            if(size == 0)
            {
                System.out.println("Linked List is Empty");
                return -1;
            }

            if(size == 1)
            {
                size--;
                return remove();
            }

            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        public void deleteNthNode(int n)
        {
            Node dummy = new Node(0);
            dummy.next = head;
            Node slow = dummy;
            Node fast = dummy;

            for (int i=0;i<=n;i++)
            {
                if(fast == null)
                {
                    System.out.println("Invalid value of N");
                    return;
                }
                fast = fast.next;
            }

            while (fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;

            dummy.next = null;

        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public int size()
        {
            return size;
        }

        public void print()
        {
            if(isEmpty())
            {
                System.out.println("Listlist is Empty");
                return;
            }
            Node temp = head;

            while(temp!=null)
            {
                System.out.print(temp.val+"--> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void reverse()
        {
            Node prev = null;
            Node curr = head;
            Node next;

            while(curr!=null)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        ll.print();

        ll.remove();

        ll.print();

        ll.removeFirst();
        ll.print();

        ll.reverse();
        ll.print();

        ll.deleteNthNode(1);
        ll.print();

    }
}
