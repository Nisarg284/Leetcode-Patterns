package Patterns;

public class Triangle {
    public static void printTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertTriangle(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void numberTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void invertNumberTriangle(int n)
    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=n;j>=i;j--)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void oddTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i*2;j++)
            {
                if(j%2!=0)
                {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        printTriangle(n);
        System.out.println();
        invertTriangle(n);
        System.out.println();
        numberTriangle(n);
        System.out.println();
        invertNumberTriangle(n);
        System.out.println();
        oddTriangle(n);
    }
}
