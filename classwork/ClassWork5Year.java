package classwork;

import java.util.Scanner;

public class ClassWork5Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Високосный");
                } else {
                    System.out.println("Не високосный");
                }
            } else {
                System.out.println("Високосный");

            }
        } else {
            System.out.println("Не високосный");
        }
    }
}
