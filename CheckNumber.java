//check even/odd aand positive/negative
//take a number and determine whether it is psotive/negative/zero and, if applicable whether it is even or odd.

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check positive, negative or zero
        if (num > 0) {
            System.out.println("Positive");

            // Check even or odd
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } else if (num < 0) {
            System.out.println("Negative");

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}