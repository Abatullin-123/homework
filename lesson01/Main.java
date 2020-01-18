package Java.firststeps;

public class Main {
        public static void main(String[] args) {
            byte byteval = -127;
            short shortval = 32767;
            int intval = 21;
            long longval = 2000L;
            float floatval = 12.23f;
            double doubleval = -123.123;
            char charval = '\u2242';
            boolean val = true;
            String s = "Hello";

            System.out.println(summ(3, 2, 10, 5));
            System.out.println(homework(1, 2));
            System.out.println(homework4(-1));
            System.out.println(homework5("OLeg"));
        }

    public static double summ(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }
    public static boolean homework(int a, int b) {
        if (a+b > 10 && a+b < 20) return true;
        else return false;
    }
public static String homework4(int a) {
            if (a < 0) {
               return ("Отрицательоне число");
            } else return ("Положительное число");
}

    public static String homework5(String name) {
        return ("Привет, " + name + "!");
    }


}
