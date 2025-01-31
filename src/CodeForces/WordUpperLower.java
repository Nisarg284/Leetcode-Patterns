package CodeForces;

public class WordUpperLower {
    public static String rightString(String s)
    {
        // count upper & lowercase characters
        int upper = 0;
        int lower = 0;

        for(int i=0;i<s.length();i++)
        {
            char ch  = s.charAt(i);
            if(ch >= 'A' && ch <='Z' )
            {
                upper++;
            }else{
                lower++;

            }
        }

        if(upper > lower)
        {
            s = s.toUpperCase();
        }else {
            s =s.toLowerCase();
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "HoUse";

        System.out.println(rightString("ViP"));



    }
}
