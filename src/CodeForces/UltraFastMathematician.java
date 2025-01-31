package CodeForces;

public class UltraFastMathematician {

    public static String ultraFast(int[]nums,int[]constants)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {
            int bit = nums[i] | constants[i];

            if(bit == 0)
            {
                sb.append("0");
            }else {
                sb.append("1");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        int[]constants ={1,1,1};


//        System.out.println(ultraFast(nums,constants));

        // division using bit manipulation
        // 16/2 = 8
        // 16>>1 = 8

        // 21>>3




        System.out.println(12*2>>2);

//        float a = 10.0f;
//        float b = 3.0f;
//        float ans = (7*(-3)>>-3)+-1;
//        System.out.println(7(-3)>>-3<<1);
    }
}
