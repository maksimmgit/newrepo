package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Hw5classif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(Objects.equals("Вася", name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
            if(Objects.equals("Анастасия", name)){
                System.out.println("Я тебя так долго ждал");
            }
                if(!(Objects.equals("Анастасия", name)) && !(Objects.equals("Вася", name))){
                    System.out.println("Добрый день, а вы кто?");
                }




    }
}