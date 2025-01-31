package Recursion;

import java.util.ArrayList;

public class Subset {

    public static void subStringHelper(String s, int n, StringBuilder ans, ArrayList<String> al)
    {
        if(n==s.length())
        {
            if(ans.isEmpty())
            {
//                System.out.print("null ");
                al.add(null);
            }else{
//                System.out.print(ans+" ");
                al.add(ans.toString());
            }
            return;
        }

        subStringHelper(s, n+1,ans.append(s.charAt(n)),al);
        ans.deleteCharAt(ans.length()-1);
        subStringHelper(s, n+1,ans,al);

    }
    public static ArrayList<String> subStrings(String str) {
        ArrayList<String>ans = new ArrayList<>();
        subStringHelper(str,0, new StringBuilder(),ans);
        return ans;
    }

    public static void subsetSumHelper(int[]arr,int n,ArrayList<Integer> ans,int sum)
    {
        if(n==arr.length)
        {
            ans.add(sum);
            return;
        }

        subsetSumHelper(arr,n+1,ans,sum+arr[n]);

        subsetSumHelper(arr, n+1, ans, sum);

//        sum = arr[n];
//        ans.add(sum);

//        for(int j=n+1;j<arr.length;j++)
//        {
//            sum+=arr[j];
//            ans.add(sum);
//        }
    }
    public static ArrayList<Integer> subsetSum(int[]arr)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        subsetSumHelper(arr,0,ans,0);
        return ans;

    }

    public static ArrayList<Integer> iterativeSubsetSum(int[]arr)
    {
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i=0;i<arr.length;i++)
        {
            int sum = arr[i];
            ans.add(sum);
            for(int j=i+1;j<arr.length;j++)
            {
                sum+=arr[j];
                ans.add(sum);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = subStrings("abc");
        System.out.println(ans);

        int[] arr ={2,3};
        ArrayList<Integer>sumIter = iterativeSubsetSum(arr);
        ArrayList<Integer>sumRecur = subsetSum(arr);

        System.out.println(sumRecur);


    }
}
