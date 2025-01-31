package Searching;

public class Linear {

    public static void main(String[] args) {
        int arr[] = {23,45,78,11,9,52,83};
        int target = 11;


        System.out.println(linearSearch(arr,target));
    }

    private static int linearSearch(int[] arr, int target) {

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }


}
