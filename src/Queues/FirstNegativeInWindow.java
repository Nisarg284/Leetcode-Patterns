package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInWindow {

    public static List<Integer> firstNegativeInWindow(int[]arr, int k)
    {
        if(k>arr.length)
        {
            return new ArrayList<Integer>();
        }

        // define Queue
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                q.add(i);
            }
        }


        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++)
        {
            if(!q.isEmpty() && q.peek()<i)
            {
                q.remove();
            }

            if(!q.isEmpty() && q.peek() <=i+k-1)
            {
                res.add(arr[q.peek()]);
            }else{
                res.add(0);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> ans = firstNegativeInWindow(arr, k);
        System.out.println(ans);
    }
}