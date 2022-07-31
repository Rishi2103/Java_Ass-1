// Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the 
// array somewhere.

// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true


import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int d = array123(arr);
        if(d == 1)
        System.out.println("true");
        else
        System.out.println("false");
    }

    public static int array123(int[] a){
        int c = 0;
        for (int i = 0; i < a.length - 2; i++) {
            if(a[i] == 1){
                if(a[i+1] == 2){
                    if(a[i+2] == 3){
                        c =1;
                        break;
                    }
                }
            }
            else
            continue;
        }
        return c;
    }
}
