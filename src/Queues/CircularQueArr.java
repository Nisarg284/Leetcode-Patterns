package Queues;

public class CircularQueArr {

    static class cirQue {
        int f = 0;
        int r = 0;
        int size = 0;
        int[] arr;

        public cirQue(int capacity) {
            arr = new int[capacity];
        }

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is Full!");
                return;
            }
//            else if (r == arr.length && f!=0) {
//                r=0;
//                arr[r] = val;
//                size++;
//                r++;
//            }
            arr[r] = val;
            r = (r + 1) % arr.length;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }


            int val = arr[f];
            f = (f + 1) % arr.length;
            size--;

            return val;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty: ");
                return -1;
            }

            return arr[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void display() {
            int i = f;
            int count = 0;
            while (count < size) {
                System.out.print(arr[i]+" ");
                i = (i+1)% arr.length;
                count++;
                }
            System.out.println();
            }

        }


    public static void main(String[] args) {

        cirQue myQue = new cirQue(4);
        System.out.println("is Empty: " + myQue.isEmpty());
        System.out.println("Queue Size: " + myQue.size());
        myQue.add(10);
        myQue.add(15);
        System.out.print("Queue Elements: ");
//        myQue.display();
        myQue.add(45);
        myQue.add(12);
        System.out.print("Queue Elements: ");
        myQue.display();
        System.out.println("Queue Size: "+myQue.size);
        myQue.remove();
        myQue.remove();
        System.out.print("Queue Elements: ");
        myQue.display();
        System.out.println("Queue Size: "+myQue.size);

        myQue.add(23);
        myQue.add(88);
        myQue.display();
        System.out.println("Queue Size: "+myQue.size);


        System.out.println(myQue.size);


    }
}

