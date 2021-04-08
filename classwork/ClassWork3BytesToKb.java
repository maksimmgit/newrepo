package classwork;

import java.util.Scanner;

public class ClassWork3BytesToKb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        System.out.print("1. Байты. 2. Килобайты: ");
        int b = sc.nextInt();
        boolean yes = b == 1;
        boolean no = b == 2;

            if (yes) {
                a = a * 1024;
                System.out.println("Число в байтах = " + a);
            } else if (no) {
                float f = (float) a / 1024;
                System.out.println("Число в килобайтах = " + f);
            } else {
                System.out.println("Неправильное значение");
            }

    }
}
