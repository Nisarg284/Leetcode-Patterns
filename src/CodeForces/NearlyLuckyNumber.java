package CodeForces;

public class NearlyLuckyNumber {
    public static boolean isLucky(int num)
    {
        int temp = num;
        while(temp>0)
        {
            int last = temp%10;
            if(last != 4 && last!=7)
            {
                return false;
            }
            temp /=10;
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 7747774;

        System.out.println(isLucky(num));

    }
}
