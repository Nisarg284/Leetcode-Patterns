package Sorting;

public class Quick {


    public static int partition(int[] arr,int si,int ei)
    {
        int pivotEle = arr[si];
        int pivotIdx = si;
        int count = 0;

        for (int i = si+1; i < arr.length; i++) {
            if(pivotEle >=arr[i])
            {
                count++;
            }
        }

        pivotIdx = count+si;
        //swap

        int temp = arr[si];
        arr[si] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        int i=si;
        int j=ei;

        while (i<pivotIdx || j>pivotIdx)
        {
            if(arr[i] <= pivotEle)
            {
                i++;
            }

            if(arr[j] > pivotEle)
            {
                j--;
            } else if (arr[i]>pivotEle && arr[j] < pivotEle) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        return pivotIdx;
    }

    public static void quickSort(int[] arr,int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }

        int pivotIdx = partition(arr,si,ei);
        quickSort(arr, si, pivotIdx-1);
        quickSort(arr, pivotIdx+1, ei);
    }

    public static void printArray(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {82,52, 4,5,1,2,10,3};
        quickSort(arr,0,arr.length-1);
        printArray(arr);

    }
}
