package home_work_2.loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HwOneOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLong()) {
            long a = sc.nextLong();
            if (a > 16) {
                System.out.println("Произойдёт переполнение. Введите меньше 17");
            } else {
                System.out.println(factorial(a));
            }
        }
        else {
            System.out.println("На данный момент обрабатываются числа до 16 включительно");
        }


    }
    public static long factorial(long a) {
        if(a<=1) {
            System.out.print(a + " = ");
            return 1;
        }
        else {
            System.out.print(a + " * ");
            return a * factorial( a - 1);
        }

    }

}
