package homework.task;

/*Кои от редовете в интерфейса са невалидни и ще бъдат отхвърлени от компилатора?*/

public class P01ValidInvalid {
    public static interface P01ValidOrInvalid {
        
        public static final int x1 = 3; //valid
        public static int x2 = 3; //valid
        static int x3 = 3; //valid
        int x4 = 3; //valid

        public int f5(); //valid

        int f6(); //valid

        public static int f7() //valid only with method body
        {
            return 0;
        }

        //private void f8(); //invalid

        //public final void f9(); //invalid

        public static final int x5 = 3; //valid

    }
}
