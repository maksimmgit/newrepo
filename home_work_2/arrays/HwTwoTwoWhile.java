package home_work_2.arrays;
import java.util.Random;
import java.util.Scanner;

public class HwTwoTwoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] container = arrayFromConsole();
        System.out.println("1. Вывести все элементы массива.");
        System.out.println("2. Вывести каждый второй элемент массива.");
        System.out.println("3. Вывести все элементы массива в обратном порядке.");
        int choose = sc.nextInt();
        if(choose == 1){
            whileAll(container);
        }else if(choose == 2){
            whileSecond(container);
        }else if(choose == 3){
            whileReverse(container);
        }else{
            System.out.println("Нет.");
        }
    }
    public static void whileAll(int[] container){
        int a = 0;
        while (a<container.length){
            System.out.println(container[a]);
            a++;
        }
    }
    public static void whileSecond(int[] container){
        int a = 0;
        while (a<container.length){
            System.out.println(container[a]);
            a+=2;
        }
    }
    public static void whileReverse(int[] container){
        int a = container.length;
        int i = 1;
        while(i<=container.length){
            System.out.println(container[a-i++]);
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
}
