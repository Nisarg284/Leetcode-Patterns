package Queues;


public class Implementation {
     static class queueArr{
         int f=0;
         int r=0;
         int size;



         int[] arr;
         public queueArr(int size){
             this.arr = new int[size];

         }

        public void add(int val)
        {
            if(size >= arr.length)
            {
                System.out.println("Queue is full");
                return;
            }
            arr[r] = val;
            r++;
            size++;
        }

        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = arr[f];
            f++;
            size--;
            return val;
        }

        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public int getSize()
        {
            return size;
        }

        public void display(){
            if(!isEmpty())
            {
                for(int i=f;i<r;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }else {
                System.out.println("Noting to Display");
            }

        }

    }

    public static void main(String[] args) {


        queueArr myQue = new queueArr(100);
        myQue.display();


        myQue.add(1);
        myQue.add(2);
        myQue.add(3);
        myQue.add(4);
        myQue.add(5);
        myQue.add(6);

        myQue.add(7);
        myQue.add(10);
        


        System.out.println("isEmpty: "+myQue.isEmpty());

        System.out.println("Size: "+myQue.getSize());

        System.out.println("Peek: "+myQue.peek());
        myQue.remove();
        System.out.println("Peek: "+myQue.peek());

        myQue.display();

        myQue.remove();
        myQue.display();









    }
}
