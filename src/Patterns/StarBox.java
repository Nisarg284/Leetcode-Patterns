package Patterns;

import java.util.Scanner;

public class StarBox {
    public static void printBox(int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printNumBox(int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row value: ");
        int m= sc.nextInt();
        System.out.println("Enter Column Value: ");
        int n = sc.nextInt();

//        printBox(m,n);
        printNumBox(m,n);

    }
}
