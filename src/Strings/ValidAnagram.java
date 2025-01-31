package Strings;

import java.util.HashMap;


public class ValidAnagram {
    private static boolean isAnagram(String str1, String str2) {

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<str1.length();i++)
        {
            char ch = str1.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<str2.length();i++)
        {
            char ch = str2.charAt(i);
            if(hm.containsKey(ch)){
                if(hm.get(ch) == 1)
                {
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(i)-1);
                }
            }else {
                return false;
            }

        }

        return hm.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "nisarg";
        String str2 = "nargis";




        System.out.println(isAnagram(str1,str2));





    }


}
