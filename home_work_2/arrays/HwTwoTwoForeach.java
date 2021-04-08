package home_work_2.arrays;

import java.util.Scanner;

public class HwTwoTwoForeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] container = arrayFromConsole();
        System.out.println("1. Вывести все элементы массива.");
        System.out.println("2. Вывести каждый второй элемент массива.");
        System.out.println("3. Вывести все элементы массива в обратном порядке.");
        int choose = sc.nextInt();
        if(choose == 1){
            forEachAll(container);
        }else if(choose == 2){
            forEachSecond(container);
        }else if(choose == 3){
            forEachReverse(container);
        }else{
            System.out.println("Нет.");
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
    public static void forEachAll(int[] container){
        for (int i : container) {
            System.out.println(i);
        }
    }
    public static void forEachSecond(int[] container){
        for (int i : container) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void forEachReverse(int[] container){
        String reverse = "";
        for (int i: container) {
            reverse = i + "\r\n" + reverse;
        }
        System.out.println(reverse);
    }
}
