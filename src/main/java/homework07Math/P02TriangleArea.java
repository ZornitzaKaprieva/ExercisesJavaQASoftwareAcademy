package homework07Math;

import java.util.Scanner;

/*Напишете метод който намира лице на триъгълник(използвайки Math класа)*/
public class P02TriangleArea {

    public static void main(String[] args) {
        //solution 01:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the are of the triangle.");

        System.out.println("Enter side A: ");
        float sideA = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter side 2: ");
        float sideB = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter angle: ");
        float angle = Integer.parseInt(scanner.nextLine());

        System.out.printf("The area of the triangle with sides %.2f and %.2f and angle %.2f degrees is %.2f.\n", sideA, sideB, angle, findTriangleAreaByTwoSidesAndAngle(sideA, sideB, angle));


        //solution 02:
        System.out.println("TriangleArea: " + findTriangleAreaByTwoSidesAndAngle(3.0, 5.0, 60.0));
    }
    public static double findTriangleAreaByTwoSidesAndAngle (double sideA, double sideB, double angle) {
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angle)); //по формулата за лице на триъгълник
    }
}
