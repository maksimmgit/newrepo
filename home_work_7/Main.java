package home_work_7;

import home_work_7.api.ISearchEngine;
import home_work_7.utils.RegExSearch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String pathof = "src\\home_work_7\\files\\";
        File path = new File(pathof);
        String[] list = path.list();
        String searchQuery;
        int bookId = 1;
        int bookNumber = 0;
        try{

            //Вписал книги в массив
            for (String s:list) {
                System.out.println("ID: "+ bookId++ + ". Книга: " + s);

            }

            System.out.println("Введите ID книги для выбора.");
            System.out.println();
            System.out.println();
            System.out.println();

            //выбираем айди книги, привязанный к названию. По-хорошему, здесь бы сделать мапу, чтобы удобно собирать
            if(sc.hasNextInt()){
                bookNumber = sc.nextInt();
                System.out.println("Выбрано " + bookNumber);
                bufferedWriter("Выбрана книга: " + list[bookNumber-1]);
            }else{
                System.out.println("Ошибка ввода ID");
            }

            //создаем путь для выбранной книги
            String text = Files.readString(Path.of((pathof + list[bookNumber-1])));
            System.out.println("Вы выбрали " + list[bookNumber-1]);

            //поиск
            System.out.println();
            System.out.println("Введите слово для поиска: ");
            searchQuery = sc.next();
            System.out.println( " поисковый запрос " + searchQuery);
            bufferedWriter("Поисковый запрос: " + searchQuery);

            ISearchEngine searchEngine = new RegExSearch();
            long searchResult = searchEngine.search(searchQuery,text);
            System.out.println(searchResult);
            bufferedWriter("Количество совпадений: " + searchResult);

        } catch (NullPointerException e){
            System.out.println("Не передавайте неверную директорию.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неправильно занесены книги в массив");
        } catch (NoSuchFileException e){
            System.out.println("Ошибка в выборе файла");
        }


    }


    static void bufferedWriter(String s) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\home_work_7\\result.txt", true));) {
            writer.write(s + "\n");

        }catch (IOException e){
            System.out.println("Ошибка во время чтения");
        }

    }
}
