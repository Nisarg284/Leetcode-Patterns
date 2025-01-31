package Strings;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicatesInStr(String str)
    {
        HashSet<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            if(!hs.contains(str.charAt(i)))
            {
                hs.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abadcds";

        System.out.println(removeDuplicatesInStr(str));

    }
}
