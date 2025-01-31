package Searching.Binary_Search;


import java.util.ArrayList;
import java.util.HashMap;

public class Binary {

    private static int binarySearch(int[]arr,int target)
    {
        int i=0;
        int j=arr.length-1;
        int mid;

        while(i<=j)
        {
            mid = (i+j)/2;

            if(arr[mid] == target)
            {
                return mid;
            } else if (arr[mid] < target) {
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr  = {11,23,32,45,78,98,101};
        int target = 98;

//        System.out.println(binarySearch(arr,target));

        char ch='2';

        int a = Character.getNumericValue(ch);

        String str = "xbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbb";

    StringBuilder sb = new StringBuilder("Nisarg");
    String sbc = "Nisarg";
     System.out.println(sbc.contains("Nis"));

//        ArrayList<String> al = new ArrayList<>();
//
//        for(int i=0;i< str.length()-2;i++)
//        {
//            for(int j=i+3;j<=str.length();j++)
//            {
//                al.add(str.substring(i,j));
//            }
//        }


//        int sum = getSum(al);

//        System.out.println(sum);

        int ans =beautySum(str);
        System.out.println(ans);


    }

    public static int getMin(HashMap<Character,Integer>hm)
    {
        int min = Integer.MAX_VALUE;
        for(char ch:hm.keySet())
        {
            min = Math.min(min,hm.get(ch));
        }
        System.out.print("Min = "+min);
        return min;
    }

    public static int getMax(HashMap<Character,Integer>hm)
    {
        int max = Integer.MIN_VALUE;
        for(char ch:hm.keySet())
        {
            max = Math.max(max,hm.get(ch));
        }

        System.out.print(", Max = "+max);


        return max;
    }

    public static int beautySum(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            HashMap<Character, Integer> hm = new HashMap<>();


//
            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                System.out.println(hm);

                int min = getMin(hm);
                int max = getMax(hm);
                //  hm.clear();

                sum += (max - min);
                System.out.print(", Diff = "+sum);
                System.out.println();
            }

        }

        return sum;
    }

    private static int getSum(ArrayList<String> al) {
        int sum = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0; i< al.size(); i++)
        {
            String s = al.get(i);
            System.out.println(s);

            for(int j=0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(char ch : hm.keySet())
            {
//                int occur = hm.get(ch);

                min = Math.min(min,hm.get(ch));
                max = Math.max(max,hm.get(ch));

//                System.out.println(sum);
            }
            System.out.print("min = "+min +", max = "+max);
            System.out.println();

            sum+=(max-min);
            hm.clear();
        }
        return sum;
    }
}
