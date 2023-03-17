package homework.string;

// from Lecture 05:

import java.util.Scanner;

/* Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.*/
public class P02Comparing {
    public static void main(String[] args) {

        //solution 01:
        String string1 = "Zornitza ";
        String string2 = "Kaprieva";

        System.out.println(string1.equals(string2));
        //or:
        System.out.println(string1 == string2);

        //solution 02:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
            String word1 = scanner.nextLine();


        System.out.println("Enter another word: ");
        String word2 = scanner.nextLine();

        System.out.printf("The two words are equal: %b\n", word1.equals(word2));
    }
}
