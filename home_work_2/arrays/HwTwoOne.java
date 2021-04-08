package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class HwTwoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Нажмите 1 (один) для ввода размера массива и его данных.");
        System.out.println("Нажмите 2 (два) для рандомного ввода. ");
        int choose = sc.nextInt();
        if(choose == 1) {
            int[] container = arrayFromConsole();
            for(int i =0; i < container.length; i++) {
                System.out.println(container[i]);
            }
        }else{
            int a = 1;
            int b = 1;
            int[] container = arrayRandom(a,b);
            for(int i = 0; i<container.length;i++) {
                System.out.println(container[i]);
            }
        }

    }
    public static int[] arrayFromConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int[] c = new int[sc.nextInt()];
        System.out.println("Вводите значения");
        for(int i = 0; i<c.length; i++){
            c[i] = sc.nextInt();
        }

        return c;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        size = sc.nextInt();
        int[] c = new int[size];
        System.out.println("Введите максимально допустимое число в массиве");
        maxValueExclusion = sc.nextInt();
        for(int i = 0; i<c.length; i++){
            Random rd = new Random();

            c[i] = rd.nextInt(maxValueExclusion);
        }

        return c;
    }
}
