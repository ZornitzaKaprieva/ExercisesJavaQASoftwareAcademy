package homework05Methods;

//from Lecture 09:

/* Напишете метод, който проверява дали въведен стринг може да бъде използван за парола.
Основни правила за парола:
Паролата трябва да е поне 8 символа;
Паролата трябва да съдържа символ, число и букви; (някои символи) */

public class P01Pass {

    public static void main(String[] args) {
        System.out.println(isPassValid("zytxucyuyv5"));

    }

    public static boolean isPassValid (String pass) {
        String regex = "\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%+=])(?=\\S+$).{8,}";
        return pass.matches(regex);
    }
}
