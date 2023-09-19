package homework.arrays;

/* Да се напише програма, която създава масив с 20 елемента от целочислен тип
и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5.
Елементите на масива да се изведат на конзолата.*/

public class P01indexMultipliedBy5 {
    public static void main(String[] args) {

        int[] numberArray = new int[20];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i * 5;
            System.out.printf("Index is: %d. Value is: %d%n", i, numberArray[i]);
        }
    }
}
