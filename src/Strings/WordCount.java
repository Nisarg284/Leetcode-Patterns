package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordCount {

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<words2.length;i++)
        {
            hs.add(words2[i]);
        }

        ArrayList<String> ans = new ArrayList<>();


        // iterate in words1
        for(int i=0;i<words1.length;i++)
        {
            HashSet<String> hs1 = hs;
            for(String s:hs)
            {
                if(words1[i].contains(s))
                {
                    hs1.remove(s);
                    System.out.println(s);
                }
            }

            // if(hs1.isEmpty())
            // {
            //     ans.add(words1[i]);
            // }

            if(hs1.isEmpty())
            {
                ans.add(words1[i]);
            }

        }

        return ans;

    }

    public static void main(String[] args) {

            String[] words1 = {"amazon","apple","facebook","google","leetcode"};
            String[] words2 = {"e","o"};

            List<String> ans = wordSubsets(words1,words2);
            int ac = 12;

           String abs = String.valueOf(ac);
            String str = ac+"";

        System.out.println(abs);

            for(String s:ans)
            {
                System.out.println(s);
            }
    }


}

