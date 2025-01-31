package Sorting;

public class Selection {


    public static void selectionSort(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIdx = findMinIdx(arr,i);

            //swapping
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

        }

    }

    public static int findMinIdx(int[]arr,int start)
    {
        int minIdx =-1;
        int minEle = Integer.MAX_VALUE;

        for(int i=start;i<arr.length;i++)
        {
            if(minEle > arr[i])
            {
                minEle = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }
    public static void printArray(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {89,52, 4,5,1,2,10,3};
        selectionSort(arr);
        printArray(arr);
    }
}
