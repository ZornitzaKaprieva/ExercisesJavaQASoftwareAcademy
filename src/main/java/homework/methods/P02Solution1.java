package homework.methods;

//from Lecture 09:

import java.util.Scanner;

/* Напишете метод, който проверява дали въведените 3 числа са:
Положителни
Равни */
public class P02Solution1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter а second number: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a third number: ");
        int c = Integer.parseInt(scanner.nextLine());


        if (a >= 0 && b >= 0 && c >= 0) {
            System.out.printf("The numbers %d, %d, and %d are positive.\n", a, b, c);
        } else if (a < 0 && b < 0 && c < 0) {
            System.out.printf("The numbers %d, %d, and %d are negative.\n", a, b, c);
        } else {
            System.out.println("Some of the numbers are positive, but some of the numbers are negative.");
        }

            if (a == b && b == c) {
                System.out.printf("The numbers %d, %d, and %d are equal to each other.\n", a, b, c);
            } else {
                System.out.printf("The numbers %d, %d, and %d are not equal to each other.\n", a, b, c);

            }
        }
    }
