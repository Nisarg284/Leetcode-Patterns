package BinarySearch;

public class Search {

    public static int bSearch(int[]arr,int target)
    {
        int i=0;
        int j=arr.length-1;

        while (i<=j)
        {
            int mid = i+(j-i)/2;

            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[mid]<target) {
                i = mid+1;

            }else {
                j = mid-1;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
        int[]arr = {4,8,12,23,60,80};
        int target = 23;

        System.out.println("Target Element is on: "+bSearch(arr, target));
    }
}
