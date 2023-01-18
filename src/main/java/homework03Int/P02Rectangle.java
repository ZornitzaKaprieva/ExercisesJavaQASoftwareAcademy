package homework03Int;

// from Lecture 06:

import java.util.Scanner;

/* Напишете програма/ метод, която за подадени дължина и височина на правоъгълник,
изкарват на конзолата неговият периметър и лице. */
public class P02Rectangle {
    public static void main(String[] args) {

        //solution 01:
        float rectangleA = 10f;
        float rectangleB = 5f;

        float areaOfARectangle = rectangleA * rectangleB;
        System.out.println("The area of the rectangle is: " + areaOfARectangle);

        float perimeterOfTheRectangle = 2 * (rectangleA + rectangleB);
        System.out.println("The perimeter of the rectangle is: " + perimeterOfTheRectangle);

        //solution 02:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the rectangle: ");
        float height = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter the length of the rectangle: ");
        float length = Float.parseFloat(scanner.nextLine());

        float area = height * length;
        System.out.println("The area of the rectangle is: " + area);

        float perimeter = 2 * (height + length);
        System.out.println("Периметърът на правоъгълника е: " + perimeter);
    }
}
