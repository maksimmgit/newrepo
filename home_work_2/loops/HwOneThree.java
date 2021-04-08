package home_work_2.loops;

import java.util.Scanner;

public class HwOneThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число!");
        int y = sc.nextInt();
        System.out.println("Введите какое-нибудь число");
        double x = sc.nextDouble();
        double result = x;
        for(int i = 1; i < y; i++){
            result = result * x;
            System.out.println(result);
        }

    }
}
