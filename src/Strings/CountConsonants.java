package Strings;

public class CountConsonants {

    public static int countConsonantsInStr(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                continue;
            }else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "Nisarg";

        System.out.println(countConsonantsInStr(str));

    }
}
