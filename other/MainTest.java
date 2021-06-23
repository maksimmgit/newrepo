package other;

import home_work_7.FileReader;
import home_work_7.utils.EasySearch;
import home_work_7.utils.RegExSearch;

import java.io.IOException;
import java.nio.file.Path;

public class MainTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();





//        //Вызов всех слов
//        System.out.println("вызов всех слов");
//       for (Object word:fileReader.allWords(fileReader.stringCleaner(fileReader.readerDirtyString(Path.of("src\\home_work_7\\files\\test.txt"))))) {
//            System.out.println(word);
//        }
//



       //вызов уникальных
        System.out.println("вызов уникальных слов");
        for (Object word:fileReader.uniqueWords(fileReader.stringCleaner(fileReader.readerDirtyString(Path.of("src\\home_work_7\\files\\test.txt"))))) {
            System.out.println(word);
        }



        //map  Создаем мапу и проверяем ее
        //Map<String, Integer> map = fileReader.wordsMap(fileReader.allWords(fileReader.reader(Path.of("src\\home_work_7\\files\\test.txt"))));
        //создаем лист
        //List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        //просим проверить лист
        //fileReader.wordsTop(10, list);

        //easySearch7 работает
        //System.out.println("Easysearch result");
        EasySearch easySearch = new EasySearch();
        //работает System.out.println(easySearch.search("она", fileReader.reader(Path.of("src\\home_work_7\\files\\test.txt"))));
        //System.out.println(easySearch.search("привет", "привет, как делапривет, как делапривет, как делапривет, как делапривет, как дела"));
        //System.out.println(easySearch.easySearch2("привет, как дела!", "привет"));

        //4.2 RegExSearch работает
        RegExSearch regExSearch = new RegExSearch();
        System.out.println(regExSearch.search("он", fileReader.readerDirtyString(Path.of("src\\home_work_7\\files\\test.txt"))));


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
