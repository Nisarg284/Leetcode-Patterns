package Patterns;

public class AirBox {
    public static void hollowBox(int m ,int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || i==n || j==1 || j==m)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n)
    {
        int count = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m=6;
        int n=4;

        hollowBox(m,n);
        floydsTriangle(n);
    }
}
