package Strings;

public class LongestWord {

    public static int longestLength(String str)
    {
        int ans=Integer.MIN_VALUE;
        int count =0;

        for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i) == ' ')
            {
                ans = Math.max(ans,count);
                count =0;
            }else{
                count++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {

        String str = "Computer is the marvelous invention of human";

        System.out.println(longestLength(str));

    }
}
