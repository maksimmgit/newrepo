package home_work_7;

import home_work_7.api.ISearchEngine;
import home_work_7.utils.RegExSearch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.*;

import static home_work_7.MultiThreadMain.bufferedWriter;

public class MultiThreadMain {
    private static String pathOf;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //обращаемся сразу к двум методам: booksToList чтобы составить список книг из папки, которую получили методом path()
        String[] bookList = booksToList(path());
        int bookNumber = 0;
        try{
            System.out.println("Введите ID книги для выбора.");
            System.out.println();
            System.out.println();
            System.out.println();

            if(sc.hasNextInt()){
                bookNumber = sc.nextInt();
                System.out.println("Выбрано " + bookNumber);
                bufferedWriter("Выбрана книга: " + bookList[bookNumber-1]);
            }else{
                System.out.println("Ошибка ввода ID");
            }
            //создаем путь для выбранной книги
            String text = Files.readString(Path.of((pathOf + bookList[bookNumber - 1])));
            System.out.println("Вы выбрали " + bookList[bookNumber-1]);
            multiThreadSearch(text);



        } catch (NullPointerException e){
            System.out.println("Не передавайте неверную директорию.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неправильно занесены книги в массив");
        } catch (NoSuchFileException | ExecutionException | InterruptedException e){
            System.out.println("Ошибка в выборе файла");
        }


    }



    /**
     * получаем папку для поиска файлов от пользователя.
     * @return
     * @throws IOException
     */
    static String path() throws IOException{
        Scanner sc = new Scanner(System.in);
        String path = "";
        try{
            System.out.println("Введите папку с книгами для поиска. Можно переписать существующую: src\\home_work_7\\files\\");
            System.out.println();
            System.out.println();
            System.out.println();
            if(sc.hasNextLine()){
                path = sc.nextLine();
                System.out.println("Выбрана папка " + path);

                //решил сделать это, чтобы вся работа с папками была в одном методе
                //
                //
                //
                //
                //не забыть проверить
                pathOf = path;
                //
                //
                //
                //
                ///////////////////////////////////////////////////////////////////////////////
            }else{
                System.out.println("Ошибка ввода папки");
            }
        } catch (NullPointerException e){
            System.out.println("Не передавайте неверную директорию.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неправильно занесены книги в массив");
        }
        return path;
    }


    /**
     *
     * @param pathof папка от пользователя, которую он ввел в методе path()
     * @return массив книг с напечатанным (не присвоенным) айди. Здесь бы мапу.
     */
    static String[] booksToList(String pathof){
        File path = new File(pathof);
        String[] list = path.list();
        int bookId = 1;
        System.out.println("Список книг:");
        for (String s:list) {
            System.out.println("ID: "+ bookId++ + ". Книга: " + s);

        }
        return list;
    }


    /**
     * Записываем результат в файл, каждый с новой строки
     * @param s запрос пользователя
     * @throws IOException
     */
    static void bufferedWriter(String s) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\home_work_7\\result.txt", true));) {
            writer.write(s + "\n");

        }catch (IOException e){
            System.out.println("Ошибка во время чтения");
        }

    }

    static void multiThreadSearch(String text) throws IOException, ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> futureTask = executorService.submit(new SearchCallable(text));
        System.out.println(futureTask.get());//результат
        executorService.shutdown();

    }

}




class SearchCallable implements Callable<Long>{
    String text;

    public SearchCallable(String text) {
        this.text = text;
    }
    @Override
    public Long call() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Введите слово для поиска: ");
        String searchQuery = sc.next();
        System.out.println( " поисковый запрос " + searchQuery);
        bufferedWriter("Поисковый запрос: " + searchQuery);
        ISearchEngine searchEngine = new RegExSearch();
        long searchResult = searchEngine.search(searchQuery,text);
        bufferedWriter("Количество совпадений при многопоточном поиске: " + searchResult);
        return searchResult;
    }
}