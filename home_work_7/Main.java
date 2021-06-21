package home_work_7;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static <T> void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();




        /*
        //Вызов всех слов
       for (Object word:fileReader.allWords(fileReader.reader(Path.of("src\\home_work_7\\files\\test.txt")))) {
            System.out.println(word);
        }

         */


        /*
       //вызов уникальных
        for (Object word:fileReader.uniqueWords(fileReader.reader(Path.of("src\\home_work_7\\files\\test.txt")))) {
            System.out.println(word);
        }
         */


        //map  Создаем мапу и проверяем ее
        //Map<String, Integer> map = fileReader.wordsMap(fileReader.allWords(fileReader.reader(Path.of("src\\home_work_7\\files\\test.txt"))));
        //создаем лист
        //List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        //просим проверить лист
        //fileReader.wordsTop(10, list);

        //easySearch7
        System.out.println("Easysearch result");
        EasySearch easySearch = new EasySearch();
        easySearch.easySearch("и", fileReader.allWords(fileReader.reader(Path.of("src\\home_work_7\\files\\test.txt"))));


        //List<String> keys = new ArrayList<String>(map.keySet());

        /*
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

         */

        //создаем лист на основе мапы
        /*
        List entryList = new ArrayList<>(map.entrySet());
        for(Object word: entryList){
            System.out.println(word);
        }

         */

    }
}
