package homework.string;

import java.util.Scanner;

// from Lecture 05:
/* Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея.*/

public class P03CountingCharacters {
    public static void main(String[] args) {

        //solution 01:
        String string1 = "Zornitza Kaprieva";

        System.out.println(string1.length());

        //solution 02:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something: ");

        String newString = scanner.nextLine();

        System.out.printf("The length of the text is %d characters.", newString.length());
    }
}
