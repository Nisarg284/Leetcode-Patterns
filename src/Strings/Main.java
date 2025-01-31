package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

       String str = "afeaz";

        StringBuilder sb = new StringBuilder(str);

        //sort the string
        sb.reverse();

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
//        System.out.println(Arrays.toString(ch));

//        System.out.println(sb.toString());

       // print a to z
        char alpha = 'a'+1;
        char c = 'b';

        int diff = 'b'-'B';
//        System.out.println(diff);

        HashMap<Float,Integer> hs = new HashMap<>();


        

        String word = "Nisarg";

        char lc = word.charAt(0);
        char uc = (char)(lc+ 32);










    }
}