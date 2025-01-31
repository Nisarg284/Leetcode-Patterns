package ByteXL;

import java.util.ArrayList;

public class JatinAndAI {

//    GCD function
    public static int GCD(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return GCD(b,a%b);
    }

//    LCM function
    public static int LCM(int a,int b)
    {
        return a*b/GCD(a,b);
    }

    public static int getMax(ArrayList<Integer>al)
    {
        int maxIdx = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<al.size();i++)
        {
            if(max < al.get(i))
            {
                max = al.get(i);
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int jatinMaxCount(int[]arr,int n)
    {
        ArrayList<Integer>al = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }


        int jatinCount = 0;


        for(int i=0;i<n*2;i++)
        {
            if(i%2==0)
            {
                int maxIdx = getMax(al);
                jatinCount+=al.get(maxIdx);
                al.remove(maxIdx);
            }
            else
            {
                al.remove((al.size()-1)/2);
            }
        }

        return jatinCount;
    }

    public static void main(String[] args) {


        int[]arr = {1,4,5,8,7,6,3,2};
        int n=4;

//        formula for GCD
//        GCD(a,b) = GCD(b,a%b)

//        lcm(a,b) = a*b/GCD(a,b)

        System.out.println(jatinMaxCount(arr,n));
    }
}
