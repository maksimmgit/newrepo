package home_work_2.utils;

import java.util.Arrays;
import java.util.Scanner;

public class HwFourUtils {
    public static void main(String[] args) {
        int[] first = {1,2,3,4,5,6};
        int[] second = {1,1,1,1};
        int[] third = {9,1,5,99,9,9};
        int[] fourth = {9,8,5,6,4,10,45,0,-10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тип сортировки.");
        System.out.println("1. Пузырьковая");
        System.out.println("2. Шейкерная");
        int choose = sc.nextInt();
        System.out.println("Выберите массив. от 1 до 4");
        int arr = sc.nextInt();
        if(choose == 1){
            switch (arr){
                case 1:
                    bubble(first);
                    break;
                case 2:
                    bubble(second);
                    break;
                case 3:
                    bubble(third);
                    break;
                default:
                    bubble(fourth);
                    break;
            }
        }else{
            switch (arr){
                case 1:
                    shake(first);
                    break;
                case 2:
                    shake(second);
                    break;
                case 3:
                    shake(third);
                    break;
                default:
                    shake(fourth);
                    break;
            }
        }

    }
    public static void bubble(int[] container){
        System.out.println(Arrays.toString(container));
        for(int i = 0; i<container.length;i++){
            int min = i;
            for (int j = i;j<container.length;j++){
                if(container[min]>container[j]){
                    min = j;
                }
                int temp = container[i];
                container[i] = container[min];
                container[min] = temp;
            }
        }
        System.out.println(Arrays.toString(container));

    }
    public static void  shake(int[] container){
        System.out.println(Arrays.toString(container));
    }

}
