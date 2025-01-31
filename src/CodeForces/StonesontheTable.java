package CodeForces;

public class StonesontheTable {

    public static int costToArrange(String s)
    {
        int count = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            char curr = s.charAt(i);
            char next = s.charAt(i+1);
            if(curr == next)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "BRBG";

        System.out.println(costToArrange(s));
    }
}
