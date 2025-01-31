package Sorting;

public class Merge {

    public static void mergeSort(int[]arr)
    {
        int n = arr.length;
        if(n==1)
        {
            return;
        }

        int n1 = n/2;
        int n2 = n-n/2;

        int[]a= new int[n1];
        int[]b= new int[n2];

        // copy both array
        for(int i=0;i<a.length;i++)
        {
            a[i]= arr[i];
        }

        for(int i=0;i<b.length;i++)
        {
            b[i] = arr[i+n1];
        }

        mergeSort(a);
        mergeSort(b);

        mergeArr(a,b,arr);
    }

    public static void mergeArr(int[]a,int[] b,int[]arr)
    {
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length)
        {
            if(a[i] >=b[j])
            {
                arr[k] = b[j];
                j++;
                k++;
            }else {
                arr[k] = a[i];
                i++;
                k++;
            }
        }

        while (j<b.length)
        {
            arr[k] = b[j];
            j++;
            k++;
        }

        while (i<a.length)
        {
            arr[k] = a[i];
            i++;
            k++;
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
        int[] arr = {101,82,52, 4,5,1,2,10,3};
        mergeSort(arr);
        printArray(arr);
    }
}
