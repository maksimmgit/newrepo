package home_work_5;

import home_work_5.DataContainer;

import java.sql.SQLOutput;
import java.util.Iterator;

public class DataMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[50]); //

        //добавляем
        container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");
        container.add("Пока");
        container.add("Ныивет");
        container.add("Нак дела");
        container.add("Ныботаю");
        container.add("Щпвай потом");
        container.add("Ншка");


        //получаем элементы по индексу
        System.out.println(container.get(2));//получаем индекс 2
        System.out.println(container.get(50));//получаем индекс 50, ответ null

        /*
        //удаляем элементы и выводим их в строку
        System.out.println("delete 6 = " + container.delete(6)+ ", " +container.toString());
        System.out.println("delete 5 = " + container.delete(5)+ ", " +container.toString());
        System.out.println("delete 1 = " + container.delete(1)+ ", " +container.toString());
        System.out.println("delete 7 = " + container.delete(7)+ ", " +container.toString());
        */

        /*
        //удаляем конкретный элемент по названию и выводим в строку
        System.out.println("delete item Покаf = " + container.delete("Покаf")+ ", " +container.toString());
        System.out.println("delete item Привет = " + container.delete("Привет")+ ", " +container.toString());
        System.out.println("delete item Пока = " + container.delete("Пока")+ ", " +container.toString());

         */


        //пункт 9, сортировка с помощью comparator
        StringComparator comparator = new StringComparator();
        container.sort(comparator);
        System.out.println(container.toString());








    }
}
