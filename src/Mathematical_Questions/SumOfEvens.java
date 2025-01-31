package Mathematical_Questions;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvens {
    public static int sumOfNatural(int n){

        int sum =0;
        for(int i=0;i<=n;i++)
        {
            if(i%2 == 0)
            {
                sum+=i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        int n = 10;

//        System.out.println(sumOfNatural(10));

        List<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(78);

        al.add(4,3);


        System.out.println(al);
//        al.add(5);
//        al.add(7);
//        al.add(9);
//        al.add(55);
//        al.add(23);
//        System.out.println(al);

//        al.forEach((System.out::println));

//        Consumer<Integer> cn = (i)-> {
//            System.out.println(i);
//        };
//
//        al.forEach(cn);





    }
}
