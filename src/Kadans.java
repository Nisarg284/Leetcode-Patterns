import java.util.ArrayList;
import java.util.HashSet;

public class Kadans {
//    what is constructor in java why we need?




    public static void main(String[] args) {
        int[] arr = {4, -1, 2, 1};
//        System.out.println(maxSubArraySum(arr));

        int sum =Math.abs(-5+6);

        String str = "Nisarg";

        HashSet<Character> hs = new HashSet<>();

        hs.add('N');
        hs.add('i');
        hs.add('s');
        hs.add('a');
        hs.add('r');
        hs.add('g');

        ArrayList<Character> ans = new ArrayList<>(hs);

        for(Character c:ans)
        {
            System.out.println(c);
        }

    }

    private static int maxSubArraySum(int[] arr) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            sum = Math.max(arr[i],arr[i]+sum);
            max = Math.max(max,sum);
        }
        return max;
    }

}




