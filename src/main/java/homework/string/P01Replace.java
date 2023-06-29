package homework.string;

import java.util.Scanner;

// from Lecture 05
/*Заместете даден под-string в даден string с друг текст:
Пример: “My name is <myName>” – заместете Test с нещо, което чете от конзолата.*/

public class P01Replace {
    public static void main(String[] args) {

        //solution 01:
        String name = "Zornitza";
        System.out.printf("My name is %s.\n", name);

        //solution 02:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name2 = scanner.nextLine();
        System.out.printf("My name is %s.\n", name2);
    }
}
