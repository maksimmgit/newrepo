package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Hw5classifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя!");
        String name = sc.nextLine();
        final String vs = "Вася";
        final String an = "Анастасия";
        if(Objects.equals(vs, name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else if(Objects.equals(an, name)){
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
