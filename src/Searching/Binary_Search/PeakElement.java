package Searching.Binary_Search;


public class PeakElement {

    public static int findPeakIndex(int[]arr)
    {
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            int mid = i + (j-i)/2;

            if(arr[mid] > arr[mid+1])
            {
                j=mid;
            }else{
                i=mid+1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int peek = findPeakIndex(arr);
        System.out.println(peek);
    }
}
