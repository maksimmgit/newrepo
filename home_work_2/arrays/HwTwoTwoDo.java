package home_work_2.arrays;

import java.util.Scanner;

public class HwTwoTwoDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] container = arrayFromConsole();
        System.out.println("1. Вывести все элементы массива.");
        System.out.println("2. Вывести каждый второй элемент массива.");
        System.out.println("3. Вывести все элементы массива в обратном порядке.");
        int choose = sc.nextInt();
        if(choose == 1){
            doAll(container);
        }else if(choose == 2){
            doSecond(container);
        }else if(choose == 3){
            doReverse(container);
        }else{
            System.out.println("Нет.");
        }
    }
    public static void doAll(int[] container){
        int a = 0;
        int i = 0;
        do{
            System.out.println(container[i++]);
            a++;
        }while (a < container.length);
    }
    public static void doSecond(int[] container){
        int a = 0;
        do{
            System.out.println(container[a]);
            a+=2;
        }while (a<container.length);
    }
    public static void doReverse(int[] container){
        int a = container.length;
        int i = 1;
        do{
            System.out.println(container[a-i++]);
        }while (i <= container.length);
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
}
