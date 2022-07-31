import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] s = new String[8][10];

        for (int i = 0; i < 8; i++) {
            System.out.println("Student" + i + ":");
            for (int j = 0; j < 10; j++) {
                s[i][j] = in.next();
            }
        }
        System.out.println("Enter the key of all the questions : ");
        String[] key = new String[10];
        for (int i = 0; i < 10; i++) {
            key[i] = in.next();
        }

        int b[] = new int[8];
        for (int i = 0; i < 8; i++) {
        int c = 0;
            for (int j = 0; j < 10; j++) {
                if (s[i][j].equals(key[j])) {
                    c++;
                    b[i] = c;
                }
            }
        }       

        for (int i = 0; i < 8; i++) {
            System.out.println("Student " + i + " : " +
            b[i]);
            }
    }
}
