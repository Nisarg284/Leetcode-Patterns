package Recursion;

public class Questions {

    public static int frogJump(int[]stones,int n,int idx)
    {
        // Base Case: 1
        if(idx == n-1)
        {
            return 0;
        }

        int oneJump = Math.abs(stones[idx]-stones[idx+1]) + frogJump(stones,n,idx+1);

        if(idx == n-2)
        {
            return oneJump;
        }
        int twoJump = Math.abs(stones[idx]-stones[idx+2]) + frogJump(stones,n,idx+2);

        return Math.min(oneJump,twoJump);

    }

    public static void findPermutations(String str1,String str2)
    {
        for(int i=0;i<str1.length();i++)
        {
            char ch1 = str1.charAt(i);
            for(int j=0;j<str2.length();j++)
            {
                char ch2 = str2.charAt(j);
                System.out.print(ch1);
                System.out.print(ch2+" ");
            }
        }
    }

    public static void whileLoopPermutation(String s1,String s2)
    {
        int i=0;
        int j=0;

        while(i<s1.length())
        {
            char ch1=s1.charAt(i);
            while (j<s2.length())
            {
                char ch2 = s2.charAt(j);

                System.out.print(ch1);
                System.out.print(ch2+" ");
                j++;
            }
            i++;
            j=0;
        }
        System.out.println();

    }

    public static void recursivePermutations(String s1,String s2,int i,int j)
    {
        if(i>=s1.length())
        {
            return;
        }

            if(j<s2.length())
            {   char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);

                System.out.print(ch1);
                System.out.print(ch2+" ");
                recursivePermutations(s1, s2, i, j+1);
            }else
            {
                recursivePermutations(s1, s2, i+1, 0);
            }


    }

    public static void main(String[] args) {
        int[]stones = {10,30,40,20};

        System.out.println("Minimum cost : "+frogJump(stones,stones.length,0));

        String s1="abc";
        String s2 = "def";
        findPermutations(s1,s2);
        System.out.println();
        whileLoopPermutation(s1,s2);
        recursivePermutations(s1,s2,0,0);
    }
}
