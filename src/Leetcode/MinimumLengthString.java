package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumLengthString {

    public static int minimumLength(String str)
    {
        if(str.length() <= 2)
        {
            return str.length();
        }

        StringBuilder sb = new StringBuilder(str);

        Set<Integer> hs = new HashSet<>();
        int count = 0;

        for(int i=0;i<sb.length();i++)
        {   char ch1 = sb.charAt(i);
            boolean flag = false;
            for (int j = sb.length()-1; j >i ; j--)
            {

                char ch2 = sb.charAt(j);
//                System.out.println(ch1);
//                System.out.println(ch2);



                if(ch2 == ch1 &&(!hs.contains(i) && !hs.contains(j)))
                {
//                    sb.deleteCharAt(i);
                    hs.add(i);
                    System.out.print(ch1+" ");
                    System.out.println(i);
//                    sb.deleteCharAt(j);
                    hs.add(j);
                    System.out.print(ch2+" ");
                    System.out.println(j);
                    count +=2;
                    flag = true;
                    break;
                }
            }

            if(!flag)
            {
                return sb.length()-count;
            }
        }
        return sb.length()-count;

    }

    public static int minimumLength1(String str)
    {
        if(str.length() <=2)
        {
            return str.length();
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;

        // count frequency
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        // iterate in hashmap
        for(char ch : hm.keySet())
        {
            int freq = hm.get(ch);

            if(freq > 2)
            {
                // Even case:
                if(freq%2 == 0)
                {
                    count += ((freq/2)-1)*2;
                }else {
                    count += (freq/2)*2;
                }
            }
        }
        return str.length()-count;

    }

    public static void main(String[] args) {

        System.out.println(minimumLength1("abaacbcbb"));



    }
}
