package home_work_4;

import java.util.Scanner;

public class Main extends HwTask3{
    public static void main(String[] args)  {
        HwTask3 object = new HwTask3();
        Scanner sc = new Scanner(System.in);
        int days;
        long ms;
        boolean shortFormat = true;
        System.out.println("Выберите задание для проверки");
        System.out.println("Введите 1 для подсчёта количества недель.");
        System.out.println("Введите 2 для конвертирования миллисекунд.");
        if(sc.nextInt() == 1){
            System.out.println("Введите количество дней.");
            days = sc.nextInt();
            if(days >0 && days <Integer.MAX_VALUE){
                System.out.println(days + " = " + days/7 + " недел"+object.toWeek(days));
            }else{
                System.out.println("Прекратите.");
            }

        }else {
            System.out.println("Далее введите количество миллисекунд. По умолчанию можете использовать 7789001");
            ms = sc.nextLong();
            if(ms>0 && ms < 999999999){
                System.out.println("Выберите шорт формат.");
                System.out.println("1. Для HH:mm:ss.SSS");
                System.out.println("2. Для текстового");
                if(sc.nextInt() == 2){
                    shortFormat = false;
                    System.out.println(object.toHoursMinuteSecondMillisecond(ms,shortFormat));
                }else{
                    System.out.println(object.toHoursMinuteSecondMillisecond(ms,shortFormat));
                }
            }
        }
    }
}
