package home_work_2.loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HwOneOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLong()) {
            long a = sc.nextLong();
            if (a > 16) {
                System.out.println("Произойдёт переполнение. Введите меньше 16");
            } else {
                System.out.println("Факториал равен " + factorial(a));
            }
        }
        else {
            System.out.println("На данный момент обрабатываются числа до 16");
        }

    }

    public static long factorial(long a) {
        long fct = 1;
        for(int i = 1; i<=a;i++){
            fct = fct*i;
            if(i<a){
              System.out.print(i + " * ");
           }
        }
       System.out.println(a + " = " + fct);
        return fct;
    }

}
