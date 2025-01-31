package Recursion;

import java.util.ArrayList;

public class RecursionOnArray {

    public static void print(int[]arr,int n)
    {
        //Base Case:
        if(n==0)
        {
            System.out.print(arr[n]+" ");
            return;
        }


        print(arr, n-1);
        System.out.print(arr[n]+" ");
    }

    public static int findMax(int[]arr,int n)
    {
        if(n==0)
        {
            return arr[n];
        }

        return Math.max(findMax(arr, n-1),arr[n]);
    }

    public static int sumOfAll(int[]arr,int n)
    {
        if(n==0)
        {
            return arr[n];
        }

        return sumOfAll(arr, n-1) + arr[n];
    }

    public static int isExist(int[] arr,int n,int key)
    {
        if(arr[n] == key)
        {
            return n;
        }
        if(n==0)
        {
            return -1;
        }

        return isExist(arr, n-1, key);
    }

    public static void printIndexOfAllOccurrences(int[]arr,int n,int key)
    {
        if(n<0)
        {
            return;
        }

        printIndexOfAllOccurrences(arr, n-1, key);
        if(arr[n] == key)
        {
            System.out.print(n+" ");
        }



    }

    public static ArrayList<Integer> getIndices(int[]arr,int n,int key)
    {
        ArrayList<Integer> indices = new ArrayList<>();

        fillIndices(arr,n,key,indices);

        return indices;
    }
    public static void fillIndices(int[]arr,int n,int key,ArrayList<Integer> indices)
    {
        if(n<0)
        {
            return;
        }

        fillIndices(arr, n-1, key, indices);
        if(arr[n] == key) {
            indices.add(n);
        }
    }

    public static boolean isSorted(int[]arr,int n)
    {
        if(arr[n] > arr[n+1])
        {
            return false;
        }

        if(n==0)
        {
            return true;
        }

        return isSorted(arr,n-1);


    }

    public static boolean isSortedLoop(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[]arr = {1,5,7,9,23,45,88};
        int n = arr.length-1;

        print(arr,n);
        System.out.println();
        System.out.println("Max: "+findMax(arr,n));
        System.out.println("Sum of All: "+sumOfAll(arr,n));
        System.out.println("Index of Given Key: "+isExist(arr,n,99));


        int[] occurs = {10,40,50,10,23,60,10};
        print(occurs,occurs.length-1);
        System.out.println();
        System.out.print("All occurrences: ");
        printIndexOfAllOccurrences(occurs,occurs.length-1,10);
        System.out.println();
        ArrayList<Integer> ans = getIndices(occurs,occurs.length-1,10);
        System.out.println("All indices: "+ans);

        int[]sorted = {1,2,3,4,5,6,7,8,9};

        System.out.println("Sorting status: "+isSorted(sorted,sorted.length-2));
    }
}
