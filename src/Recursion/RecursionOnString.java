package Recursion;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RecursionOnString {

    public static void removeHelper(String str,int n,char ch,StringBuilder sb)
    {
        if(n<0)
        {
            return;
        }

//        if(str.charAt(n)!=ch)
//        {
//            removeHelper(str, n-1, ch, sb.append(str.charAt(n)));
//        }else {
//            removeHelper(str, n-1, ch, sb);
//        }

        removeHelper(str, n-1, ch, sb);

        if(str.charAt(n)!=ch)
        {
            sb.append(str.charAt(n));
        }

    }

    public static String removeOccure(String str,char ch)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=ch)
            {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String removeOccurrences(String str,char ch)
    {
        int n=str.length();
        StringBuilder sb = new StringBuilder();
        removeHelper(str,n-1,ch,sb);

        return sb.toString();
    }

    public static void reverseString(String str,int n)
    {
        if(n<0)
        {
            return;
        }

        System.out.print(str.charAt(n)+" ");
        reverseString(str,n-1);

    }

    public static void reverseStringLoop(String str)
    {
        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean isPalindromeLoop(String str)
    {
        int i=0;
        int j=str.length()-1;

        while (i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome(String str,int start,int end)
    {
        if(start >= end)
        {
            return true;
        }

        if(str.charAt(start) != str.charAt(end))
        {
            return false;
        }
        return isPalindrome(str, start+1, end-1);
    }


    public static void main(String[] args) {
        String str = "abcax";
        char ch = 'a';
        String s1 = "Nisarg";



        System.out.println("Iterative New String: "+removeOccure(str,ch));
        System.out.println("Recursive New String: "+removeOccurrences(str,ch));
        reverseStringLoop(s1.toUpperCase());
        reverseString(s1,s1.length()-1);
        System.out.println();

        String palindrome = "racecar";
        System.out.println("Is Palindrome Loop: "+isPalindromeLoop(palindrome));
        System.out.println("Is Palindrome Recursive: "+isPalindrome(palindrome,0,palindrome.length()-1));










    }


}
