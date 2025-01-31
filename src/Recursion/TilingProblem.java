package Recursion;

public class TilingProblem {

    public static int placeTiles(int n,int m,int i,int j)
    {
        if(n<i || m<j)
        {
            return 0;
        }
        return 1+Math.max(placeTiles(n-1,m,i,j),placeTiles(n,m-1,i,j));
    }
    public static void main(String[] args) {

//        System.out.println(placeTiles(4,3,2,1));


        StringBuilder s = new StringBuilder(" NISARG  ");
        // remove trailing and backward spaces from string
        s.trimToSize();
//        s.append('k');

//        s.isEmpty()

        // inbuilt function for remive trailing and backward spaces
        s.trimToSize();
        System.out.println(s);

        // what does trimToSize() do?
        // trimToSize() is used to trim the capacity of the StringBuilder instance to be the same as the current size.
        System.out.println(s + "size: "+s.length());

        System.out.println(2%3);





    }
}