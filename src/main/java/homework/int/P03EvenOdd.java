package homework03Int;

import java.util.Scanner;

/* Напишете програма/ метод, която чете число и изписва в конзолата дали числото е четно или не? */

public class P03EvenOdd {
    public static void main(String[] args) {

        //solution 01:
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }

        //solution 02:
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number to find out if it's even: ");
        // int number = Integer.parseInt(scanner.nextLine());
        // if (number % 2 == 0) {
        //     System.out.println("This number is even.");
        // } else {
        //     System.out.println("This number is odd.");
        // }
    }
}
