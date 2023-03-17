package homework.math;

import java.util.Random;

/*Напишете метод който има един входен параметър за дължина на масив и пълни масива с случайни числа
(да се използва клас Random). */
public class P03ArrayRandom {
    public static void main(String[] args) {

        int[] arrayRandomNumbers = new int[10];

        printRandomNumbersInArray(arrayRandomNumbers);
    }

    public static int printRandomNumbersInArray (int[] setRandomNumbers) {
        Random random = new Random();
        int i; // = random.nextInt(1, 5);

        for (i = 0; i < setRandomNumbers.length; i++) {
            setRandomNumbers[i] = random.nextInt(1, 5);
            System.out.println(setRandomNumbers[i]);
        }
        return i;
    }
}
