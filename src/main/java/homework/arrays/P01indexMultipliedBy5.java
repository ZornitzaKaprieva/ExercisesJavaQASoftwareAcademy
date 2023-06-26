package homework.arrays;

/* Да се напише програма, която създава масив с 20 елемента от целочислен тип
и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5.
Елементите на масива да се изведат на конзолата.*/

public class P01indexMultipliedBy5 {
    public static void main(String[] args) {

        int[] to20Answer = new int[20];
        int i = 0;

        for (i = 0; i < to20Answer.length; i++) {
            to20Answer[i] = i * 5;
            System.out.println(to20Answer[i]);
        }
    }
}
