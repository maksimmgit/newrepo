package home_work_1;

import java.util.Scanner;

public class Hw5classswith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        switch (name){
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
