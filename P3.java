// Given two non-negative int values, return true if they have the same last digit, such 
// as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 
// 10 is 7.

// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true


import java.util.Scanner;

public class P3 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = in.nextInt();

         lastDigit(num1, num2);
        
    }
    public static void lastDigit(int n1, int n2){
        String ans = "";
        if((n1 % 10) == (n2 % 10))
            System.out.println("True");
        else
        System.out.println("False");
    }
}
