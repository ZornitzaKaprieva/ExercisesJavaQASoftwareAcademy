package homework07Math;

import java.util.Scanner;

/*Ъпдейтнете задачата с намирането на максималното измежду 3 числа да използва Math класа.*/
public class P01MathMax {

    public static void main(String[] args) {

        //solution 01:
        int x = 11;
        int y = 22;
        //and
        int z = 33;
        System.out.printf("Between the numbers entered %d and %d, the larger is %d.\n", x, y, Math.max(x, y)); // най-голямото от 2 подадени числа

        System.out.printf("Between the numbers entered %d, %d and %d, the larger is %d.\n", x, y, z, Math.max(x, Math.max(y, z))); //най-голямото от 3 подадени числа

        //solution 02:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter а second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a third number: ");
        int number3 = Integer.parseInt(scanner.nextLine());

        System.out.printf("Between the numbers entered %d, %d and %d, the larger is %d.\n", number1, number2, number3, Math.max(number1, Math.max(number2, number3)));

    }
}
