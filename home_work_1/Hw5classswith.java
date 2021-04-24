package home_work_1;

import java.util.Scanner;

public class Hw5classswith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя!");
        String name = sc.nextLine();
        final String vs = "Вася";
        final String an = "Анастасия";
        switch (name){
            case vs:
                System.out.println("Привет!");
            case an:
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
