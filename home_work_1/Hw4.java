package home_work_1;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        int week = 5;
        int vaca = 7;
        Scanner sc = new Scanner (System.in);
        int day = sc.nextInt();
        boolean weekday = true;
        boolean vacation = true;
        /*
        if(day == vaca)
            {
                vacation = true;
                weekday = false;
            }
         else {
            weekday = true;
            vacation = false;
            if (sleepIn(weekday, vacation))
                System.out.println("работать");
        }
Этот код через if не смог реализовать никакимми попытками. Часть кода уже удалена.
Переменные vacation и weekday не меняли значения.
IDEA подсказывала, что выражение sleepIn(weekday, vacation) всегда true. Не понял почему.
Через switch сработало и вполне логично, но не понял почему if косячило.
         */

        switch(day){
            case 7:
                vacation = true;
                weekday = false;
                break;

            default:
                vacation = false;
                weekday = true;
        }
            if (sleepIn(weekday, vacation)) {
                System.out.println("Можно спать");
            } else {
                System.out.println("работать");
            }

    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation)
            return true;
        else
            return false;





    }
}
