package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = {1,3,2,1,8,6,3,4};
        print(arr);
        int[] ans = nge(arr);
        print(ans);

    }

    public static void print(int[]arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static int[] nge(int[] arr) {
        Stack<Integer> st = new Stack<>();

        int []ans = new int[arr.length];

        ans[arr.length-1] = -1;
        st.push(arr.length-1);
        for(int i = arr.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i] >= arr[st.peek()])
            {
                st.pop();
            }

            if (!st.isEmpty())
            {
                ans[i] = arr[st.peek()];
                st.push(i);
            }else {
                ans[i] = -1;
                st.push(i);
            }

        }
        return ans;
    }
}
