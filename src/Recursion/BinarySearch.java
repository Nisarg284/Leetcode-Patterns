package Recursion;

public class BinarySearch {

    public static void printMatrix(int[][]matrix)
    {
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]arr = {2,4,6,8,10,15,23,32};

        int index = searchElement(arr,23,0,arr.length-1);

//        System.out.println(index);
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(matrix);
    }


    public static int searchElement(int[] arr, int key, int i, int j) {

        if(i<=j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (key < arr[mid]) {
                return searchElement(arr, key, i, mid - 1);
            } else {
                return searchElement(arr, key, mid + 1, j);
            }
        }
        return -1;
    }
}
