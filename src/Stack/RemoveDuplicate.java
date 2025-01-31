package Stack;

import java.util.*;

public class RemoveDuplicate {

    public static int minIdx(String str)
    {
        int min = 0;

        for(int i=1;i<str.length();i++)
        {
            char curr = str.charAt(min);
            char next = str.charAt(i);
            if(curr > next)
            {
                min = i;
                System.out.println(min);
            }
        }
        return min;
    }

    public static String removeDuplicateLetters(String str)
    {
        if(str.length()< 2)
        {
            return str;
        }
        Set<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<>();


        // This is for extracting duplicates from string Also add all characters in q for further operations
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!hs.contains(ch))
            {
                sb.append(ch);
                hs.add(ch);
            }
            q.add(ch);
        }

        // Get minimum element index from string
        int minIdx = minIdx(sb.toString());

        while(q.peek()!=sb.charAt(minIdx))
        {
            q.remove();
        }

        StringBuilder sb1 = new StringBuilder();
        hs.clear();

        while(!q.isEmpty())
        {

            if(!hs.contains(q.peek()))
            {
                hs.add(q.peek());
                sb1.append(q.peek());
            }

            q.remove();

        }
        if(sb.length() != sb1.length())
        {
            int diff = sb.length() - sb1.length();
            sb.replace(diff,sb.length(),sb1.toString());
            return sb.toString();
        }

        return sb1.toString();
    }

    public static void sum (int n)
    {
        int evenSum = 0;
        int oddSum = 0;


        for(int i=0;i<n;i++)
        {
            if(i%2 == 0)
            {
                evenSum+=i;
                System.out.println(" even "+evenSum+" ");
//                System.out.print(" Even"+i);
            }else {
                oddSum+=i;
                System.out.println("odd = "+oddSum+" ");
//                System.out.print(" odd"+i);
            }
        }

//        System.out.println(evenSum);
//        System.out.println(oddSum);
    }


        public static boolean isIsomorphic(String s, String t) {

            if(s.length()!=t.length())
            {
                return false;
            }

            HashMap<Character,Character> hm = new HashMap<>();

            for(int i=0;i<s.length();i++)
            {
                char ch1 = s.charAt(i);
                char ch2= t.charAt(i);


                if(!hm.containsKey(ch1))
                {
                    hm.put(ch1,ch2);
                }else{
                    if(hm.containsKey(ch1)  && ch2 != hm.get(ch1))
                    {
                        return false;
                    }
                }
            }
            return true;

        }


    public static void main(String[] args) {

        String s = "ecbacba";
        StringBuilder sb = new StringBuilder(s);

        System.out.println(isIsomorphic("badc","baba"));
        int[] ans = {1,5,6,7,8,9};

        // reverse an array





//        sb.rev
//         sb.replace(1,sb.length(),"abcdef");
//        System.out.println(sb);

//        sum(10);


//        System.out.println(removeDuplicateLetters(s));




    }
}
