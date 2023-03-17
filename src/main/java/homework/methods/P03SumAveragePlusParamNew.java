package homework.methods;

//from Lecture 09:

/* Напишете метод, който на база въведени две числа връща средна стойност.//  ok
Напишете др метод, който приема два параметъра - числа, и връща сумата им. //ok

Извикайте втория метод с параметри първия. */


public class P03SumAveragePlusParamNew {

    public static void main(String[] args) {
        returnAverage(7, 8);
        returnSum(7, 8);
        returnSumWithAverageParam(returnAverage(4,6));
    }

    //средна стойност:
    public static float returnAverage (float a, float b) {
        System.out.printf("Average value of %.0f and %.0f is %.1f.\n", a, b, (a + b)/2);
        return (a + b)/2f;
    }

    //сума:
    public static float returnSum (float a, float b) {
        System.out.printf("The sum of %.0f and %.0f is %.0f.\n", a, b, (a + b));
        return a + b;
    }

    //сума с параметри на средна стойност:
    private static void returnSumWithAverageParam (float returnAverage) {
    }

}
