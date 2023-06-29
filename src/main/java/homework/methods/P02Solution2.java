package homework.methods;

//from Lecture 09:
/* Напишете метод, който проверява дали въведените 3 числа са:
Положителни / Равни */

public class P02Solution2 {
       public static void main(String[] args) {
        arePositiveNumbers(1, 2, 3);
        areEqualsNumbers(7, 7, 7);
    }

    public static boolean arePositiveNumbers (int a, int b, int c){
        if (a >= 0 && b >= 0 && c >= 0) {
            System.out.printf("The numbers %d, %d, and %d are positive.\n", a, b, c);
            return true;
        } else if (a < 0 && b < 0 && c < 0){
            System.out.printf("The numbers %d, %d, and %d are negative.\n", a, b, c);
            return true;
        } else {
            System.out.println("Some of the numbers are positive, but some of the numbers are negative.");
            return true;
        }
    }

    public static boolean areEqualsNumbers (int a, int b, int c) {
        if (a == b && b == c) {
            System.out.printf("The numbers %d, %d, and %d are equal to each other.\n", a, b, c);
            return true;
        } else {System.out.printf("The numbers %d, %d, and %d are not equal to each other.\n", a, b, c);
            return true;
        }
    }
}
