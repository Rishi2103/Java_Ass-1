// Given 2 strings, a and b, return the number of the positions where they contain the 
// same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
// and "az" substrings appear in the same place in both strings.

// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0


import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String s1 = in.nextLine();
        System.out.println("Enter the second String : ");
        String s2 = in.nextLine();

        int ans = stringMatch(s1, s2);
        System.out.println(ans);
    }
    
    public static int stringMatch(String a, String b){
        int count = 0;
        int min = b.length();
        if(b.length() > a.length())
        min = a.length();
        for (int i = 0; i < min-1; i++) {
            String c = a.substring(i, i+2);
            String d = b.substring(i, i+2);
            if(c.equals(d))
            count ++;
        }
        return count;
    }
}
