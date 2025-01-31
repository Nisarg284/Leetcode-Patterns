package CodeForces;

import java.util.Arrays;

public class LightsOut {

    public static void printMatrix(int[][]mat)
    {
        boolean[][]arr = new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr[i][j] = true;
            }
        }

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j] % 2 == 1)
                {
                    arr[i][j] = !arr[i][j];

                    if(i>0)
                    {
                        arr[i-1][j] = !arr[i-1][j];
                    }

                    if(i<arr.length-1)
                    {
                        arr[i+1][j] = !arr[i+1][j];
                    }

                    if(j>0)
                    {
                        arr[i][j-1] = !arr[i][j-1];
                    }

                    if(j<arr.length-1)
                    {
                        arr[i][j+1] = !arr[i][j+1];
                    }
                }
            }
        }

        // print matrix
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(arr[i][j])
                {
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        int[][]mat = {{1,0,1},{8,8,8},{2,0,3}};

        printMatrix(mat);


    }
}
