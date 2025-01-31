package Mathematical_Questions;

import java.util.ArrayList;

public class MinMax {

//    public static int sumMinMax(int[] arr)
//    {
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(max < arr[i])
//            {
//                max=arr[i];
//            }else {
//                min = arr[i];
//            }
//        }
//        retrun min + max;
//    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,78,-2};

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            al.add(i);
        }


        al.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println(al);

//        Arrays.stream(arr).map(i->i).forEach(System.out::println);
//        Arrays.stream(arr).filter(i->i%2==0).map(i->i).forEach(System.out::println);

    }
}
