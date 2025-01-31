package Strings;

public class CountWords {

    public static int countWordsInStr(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }
        int count = 1;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String str = "I am unstoppable. No buddy can Stop me";

        System.out.println(countWordsInStr(str));


    }
}
