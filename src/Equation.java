import java.util.Scanner;

public class Equation {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String x = in.nextLine();
        int length = x.length();
        if (length>5) {System.out.print("Не верно ввели уравнение");}
        else {
            char search = 'x';
            char z = x.charAt(1);
            int a = x.charAt(0) - '0';
            int b = x.charAt(2) - '0';
            int c = x.charAt(4) - '0';
            int r;
            switch (z) {

                case '+':

                    if (x.charAt(4) == search) {
                        c = a + b;
                        System.out.print("Вывод: " + c);
                    } else {
                        r = c - b;
                        System.out.print("Вывод: " + r);
                    }
                    break;

                case '-':
                    if (x.charAt(0) == search) {
                        a = c + b;
                        System.out.print("Вывод: " + a);
                    } else if (x.charAt(2) == search) {
                        r = a - c;
                        System.out.print("Вывод: " + r);
                    } else {
                        r = a - b;
                        System.out.print("Вывод: " + r);
                    }
                    break;
            }
        }


    }
}
