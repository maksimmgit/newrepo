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

        switch(day){
            case 7:
                weekday = false;
                break;

            default:
                vacation = false;
        }
            if (sleepIn(weekday, vacation)) {
                System.out.println("Можно спать");
            } else {
                System.out.println("работать");
            }

    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;





    }
}
