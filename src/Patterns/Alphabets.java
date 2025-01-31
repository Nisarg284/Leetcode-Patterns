package Patterns;

public class Alphabets {

    public static void printBox(int n)
    {

        for(int i=0;i<n;i++)
        {
            for(char ch = 'A';ch<='D';ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void printPlus(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==n/2 || j ==n/2)
                {
                    System.out.print("*");
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int n=5;
        printBox(n);
        printPlus(n);

    }
}
