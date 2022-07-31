// Given an array of strings, return a new array without the strings that are equal to 
// the target string. One approach is to count the occurrences of the target string, make 
// a new array of the correct length, and then copy over the correct strings.

// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]


import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = in.nextInt();
        String[] s = new String[n];
        System.out.println("Enter the array : ");
        for (int i = 0; i < s.length; i++) {
            s[i] = in.next();
        }
        System.out.println("Enter the string that you want to remove : ");
        String r = in.next();
        wordsWithout(s, r);
    }

    static void wordsWithout(String a[], String b){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(b))
            count ++ ;
        }
        String[] c = new String[a.length-count];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(!a[i].equals(b)){
                c[j] = a[i];
                j++;
            }
        }
        System.out.println("The new array is : ");
        for(String element:c){
            System.out.print(element + " ");
        }
    }
}
