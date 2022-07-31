// Display numbers in a pyramid pattern.
//                  1
//                1 2 1
//              1 2 4 2 1
//            1 2 4 8 4 2 1
//         1 2 4 8 16 8 4 2 1
//      1 2 4 8 16 32 16 8 4 2 1
//   1 2 4 8 16 32 64 32 16 8 4 2 1
// 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1


import java.util.Scanner;

public class P7 {
    private static final String string = " ";
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    int num = 0;
    for (int row = 0; row <= 7; row++) {
    for (int col = 1; col <= 7 - row; col++) {
    System.out.printf("%4s", string);
    }
    for (int column = 0; column <= row; column++) {
    num = (int) Math.pow(2, column);
    System.out.printf("%4d", num);
    }
    for (int col = row - 1; col >= 0; col--) {
    num = (int) Math.pow(2, col);
    System.out.printf("%4d", num);
    }
    System.out.println();
    }
    }
}
    
