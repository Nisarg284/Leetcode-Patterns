package Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class ReverseString {
    static class Node{
        int val;
        Node next;

        public Node(int data)
        {
            this.val = data;
            this.next =null;
        }
    }

    public static String reverseStr(String str)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

//    public static String reverseStr1(String s)
//    {
//         int i=0;
//         int j=s.length()-1;
//
//         while(i<j)
//         {
//             char ch1 = s.charAt(i);
//             char ch2 = s.charAt(j);
//
//
//             ch1 = ch2;
//             ch2 = temp;
//
//             i++;
//             j--;
//         }
//
//         return s;
//    }

    public static void main(String[] args) {

        String str = "Nisarg";
        System.out.println(str.contains("Ni"));

        ArrayList<Integer> als = new ArrayList<>();

        HashSet<Integer>hs = new HashSet<>();

        // iterate in hashset
        for(Integer i:hs)
        {
            System.out.println(i);
        }


//        // sort a String characters
//        String s = "Nisarg";
//        char[] ch = s.toCharArray();
//        Arrays.sort(ch);






        HashSet<Integer> hs1 = hs;
//        hs1.add(12);
//        for(Integer i:hs1)
//        {
//            System.out.println(i);
//        }

        System.out.println(hs == hs1);

        als.add(12);
        als.add(98);

        als.clear();

        Node n1 = new Node(20);

        StringBuilder sb = new StringBuilder(str);



//        sb.insert(0,'s');
//        sb.insert(0,'2');
        System.out.println(sb);

//        System.out.print(reverseStr(str));

    }
}
