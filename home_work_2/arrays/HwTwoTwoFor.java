package home_work_2.arrays;

import java.util.Scanner;

public class HwTwoTwoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] container = arrayFromConsole();
        System.out.println("1. Вывести все элементы массива.");
        System.out.println("2. Вывести каждый второй элемент массива.");
        System.out.println("3. Вывести все элементы массива в обратном порядке.");
        int choose = sc.nextInt();
        if(choose == 1){
            forAll(container);
        }else if(choose == 2){
            forSecond(container);
        }else if(choose == 3){
            forReverse(container);
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
    public static void forAll(int[] container){
        int i;
        for(i = 0; i<container.length;i++){
            System.out.println(container[i]);
        }
    }
    public static void forSecond(int[] container){
        int i;
        for(i=0; i<container.length;){
            System.out.println(container[i]);
            i+=2;
        }
    }
    public static void forReverse(int[] container){
        int i=1;
        int a;
        for(a = container.length;i<=container.length;){
            System.out.println(container[a-i++]);

        }
    }

}
