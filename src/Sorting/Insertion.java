package Sorting;

public class Insertion {

    private static void insertionSort(int[]arr)
    {
        int j;
        for(int i=1;i<arr.length;i++)
        {
            j=i;

            while(j>=1 && arr[j] <= arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {60,50,40,30,20,10};


        insertionSort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }









    }
}
