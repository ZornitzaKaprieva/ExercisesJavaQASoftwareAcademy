package homework.scanner;

import java.util.Scanner;

// from Lecture 04:
/*Напишете програма, която:
- Чете за име на потребител;
- Чете за любимо хоби на потребителя;
- Изписва в конзолата подходящо съобщение за потребителя и хобито;*/

public class P01Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Your name is %s.\n", name);

        System.out.println("Enter your hobby: ");
        String hobby = scanner.nextLine();
        System.out.printf("Your hobby is %s.\n", hobby);
    }
}
