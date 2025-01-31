package Recursion;

import java.util.HashMap;

public class Combinations {



    public static void main(String[] args) {
        String digits = "23";

        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        System.out.println(hm.get('5'));



    }
}
