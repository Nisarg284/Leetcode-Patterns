package Sorting;

public class Bubble {

    public static void bubbleSort(int[]arr)
    {
        int n =arr.length;
        boolean flag;

        for (int i = 0; i < n; i++) {
            flag = true;
            for (int j = 0; j < n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // swap values
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag)
            {
                return;
            }
        }

    }
    public static void printArray(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {52, 4,5,1,2,10,3};
        bubbleSort(arr);
        printArray(arr);
    }
}
