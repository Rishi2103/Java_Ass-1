import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int r = 9;
        final int c = 9;
        int arr[][]= new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = in.nextInt();
            }
        }
    }
}
