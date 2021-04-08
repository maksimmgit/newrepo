package home_work_2.loops;

import java.util.Scanner;

public class HwOneFour {
    public static void main(String[] args) {
        long a = 1L;
        long result = 0L;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        if(b>0) {
            do {
                a = a * b;
                System.out.println(a);
            }
            while (a <= Long.MAX_VALUE / b);
            System.out.println("Значение до переполнения = " + a);
            System.out.println("Значение после переполнения = " + (double) a * b);
        }
        else if(b<0){
            do {
                a = a * b;
                System.out.println(a);
            }
            while (a <= Long.MIN_VALUE / b);
            System.out.println("Значение до переполнения = " + a);
            System.out.println("Значение после переполнения = " + (double) a * b);
        }

    }
}
