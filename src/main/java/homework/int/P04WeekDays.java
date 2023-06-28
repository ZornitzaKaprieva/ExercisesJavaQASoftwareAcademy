package homework03Int;

import java.util.Scanner;

/* Напишете програма/ метод, която чете число от 1 до 7 в конзолата
и на базата на това изписва в конзолата деня от седмицата във формат: 
You have selected {day number}. Day of the week is {day of the week}*/

public class P04WeekDays {
    public static void main(String[] args) {

        //solution 01:
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("You have selected 1. Day of the week is Monday.");
                break;
            case 2:
                System.out.println("You have selected 2. Day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("You have selected 3. Day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("You have selected 4. Day of the week is Thursday.");
                break;
            case 5:
                System.out.println("You have selected 5. Day of the week is Friday.");
                break;
            case 6:
                System.out.println("You have selected 6. Day of the week is Saturday.");
                break;
            case 7:
                System.out.println("You have selected 7. Day of the week is Sunday.");
            default:
                System.out.println("Try again.");
        }

        //solution 02:
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter 1 to 7, for the day of the week:");

        // int dayNumber = Integer.parseInt(scanner.nextLine());

        // switch (dayNumber) {
        //     case 1:
        //         System.out.println("You have selected 1. Day of the week is Monday.");
        //         break;
        //     case 2:
        //         System.out.println("You have selected 2. Day of the week is Tuesday.");
        //         break;
        //     case 3:
        //         System.out.println("You have selected 3. Day of the week is Wednesday.");
        //         break;
        //     case 4:
        //         System.out.println("You have selected 4. Day of the week is Thursday.");
        //         break;
        //     case 5:
        //         System.out.println("You have selected 5. Day of the week is Friday.");
        //         break;
        //     case 6:
        //         System.out.println("You have selected 6. Day of the week is Saturday.");
        //         break;
        //     case 7:
        //         System.out.println("You have selected 7. Day of the week is Sunday.");
        //     default:
        //         System.out.println("Try again.");
        // }
    }
}
