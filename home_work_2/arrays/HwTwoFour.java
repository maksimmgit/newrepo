package home_work_2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HwTwoFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int[] container = arrayRandom(a,b);
        for(int i = 0; i<container.length;i++) {
            System.out.print(container[i] + "\t");
        }
        System.out.println();
        System.out.println("1. Сумма четных положительных элементов массива.");
        System.out.println("2. Максимальный из элементов массива с четными индексами.");
        System.out.println("3. Элементы массива, которые меньше среднего арифметического.");
        System.out.println("4. Найти два наименьших (минимальных) элемента массива.");
        System.out.println("5. Сжать массив, удалив элементы, принадлежащие интервалу.");
        System.out.println("6. Сумма цифр массива.");
        int choose = sc.nextInt();
        if(choose == 1){
            sumEven(container);
        }else if(choose == 2){
            maxEven(container);
        }else if(choose == 3){
            lowestMiddle(container);
        }else if(choose == 4){
            twoMin(container);
        }else if(choose == 5){
            interval(container);
        }else if(choose == 6){
            sum(container);
        }else{
            System.out.println("Нет.");
        }

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
    public static void sumEven(int[] container){
        int n = 0;
        for(int i = 0; i<container.length;i++){
            if((container[i]%2) == 0){
                n +=container[i];
            }

        }
        System.out.println(n);
    }
    public static void maxEven(int[] container){
        int maxIndex = 0;
        for(int i = 0;i<container.length;) {
            if(maxIndex<container[i]){
                maxIndex=container[i] ;
            }
            i+=2;
        }
        System.out.println(maxIndex);
    }
    public static void lowestMiddle(int[] container){
        int mid = 0;
        for(int i = 0; i<container.length;i++) {
            mid+=container[i];
        }
        mid = mid/container.length;
        int min = 0;
        for(int j = 0; j<container.length;j++){
            if(container[j]<mid){
                System.out.println(container[j] + " меньше среднего арифметического.");
            }
        }
    }
    public static void twoMin(int[] container){
        int min1;
        int min2;
        if(container[0]<=container[1]){
            min1 = container[0];
            min2 = container[1];
        }else{
            min1 = container[1];
            min2 = container[0];
        }


        for(int i = 2; i< container.length;i++)
            if(min1>container[i]){
                min1 = container[i];
            }
        for(int j = 2; j<container.length;j++){
                if(min2>=container[j]) {
                    if(container[j]>min1) {
                        min2 = container[j];
                    }
                }
            }


        System.out.println(min1 + " первое минимальное.");
        System.out.println(min2 + " второе минимальное.");
    }
    public static void interval(int[] container){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите интервал. Число будет означать фактическое расположение элемента в массиве. То есть 1 = первому элементу.");
        System.out.println("Первое значение (включительно).");
        int a = sc.nextInt()-1;
        System.out.println("Второе значение (включительно).");
        int b = sc.nextInt()-1;
        if(a<b) {
            int tempLength = container.length - (b - a + 1);
            int[] temp = new int[tempLength];
            for (int i = 0, j = 0; i < container.length; i++) {
                if (i < a || i > b) {
                    temp[j] = container[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(temp));
        }else if(a>=b) {
            System.out.println("Вводите первое значение меньше второго пожалуйста");
        }
    }
    public static void  sum(int[] container){
        int sum = 0;
        for(int i = 0; i<container.length;i++){
            sum+=container[i];
        }
        System.out.println(sum);
    }
}
