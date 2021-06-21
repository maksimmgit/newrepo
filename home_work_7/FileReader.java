package home_work_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileReader<T> {

    public boolean fileExist(Path path) {
        if (Files.exists(path)) {
            return true;
        } else {
            return false;

        }

    }

    public String reader(Path path) throws IOException {
        String content = "";
        try {
            content = new String(Files.readAllBytes(path));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при чтении файла");
        }
        //Зачищаю сразу строку от лишних символов и заменяю их пробелами
        content = content.replace(",", " ");
        content = content.replace(".", " ");
        content = content.replace("!", " ");
        content = content.replace("?", " ");
        content = content.replace("\"", " ");
        content = content.replace("--", " ");
        content = content.replace(";", " ");
        content = content.replace(":", " ");
        content = content.replace("(", " ");
        content = content.replace(")", " ");


        return content;
    }



/*
Из этого родили метод внизу
    public List allWords(String content){
        List<String> list = new ArrayList<String>();
        Set<String> hashSet = new HashSet<>();

        //for(String word:content.split("[^а-яА-я0-9]+")){
        //разделяем по одному или нескольким пробелам
        for(String word:content.split("\\s+")){
            list.add(word);
        }
        return list;
    }

 */

    /**
     * @param content принимаем очищенную от лишних символов строку
     * @return возвращаем сет всех вообще слов без привязки к регистру
     */
    public List<String> allWords(String content) {
        //разделяем по одному или нескольким пробелам
        List<String> list = new ArrayList<>(Arrays.asList(content.split("\\s+")));
        System.out.println("В тексте использовано " + list.size() + " любых слов.");
        return list;
    }


    /**
     * В конце распечатывает кол-во индексов.
     *
     * @param content принимаем очищенную от лишних символов строку
     * @return сет уникаальных слов без привязки к регистру
     */
    public Set<String> uniqueWords(String content) {
        Set<String> hashSet = new HashSet<>(Arrays.asList(content.split("\\s+")));
        //разделяем по одному или нескольким пробелам

        System.out.println("В тексте использовано " + hashSet.size() + " уникальных слов.");
        return hashSet;
    }

    /**
     *
     * @param collection переданный необработанный список слов
     * @return обработанная мапа вида "слово, значение"
     */
    public Map<String, Integer> wordsMap(Collection<String> collection) {
        int count = 1;
        Map<String, Integer> map = new HashMap<>();
        for (String item : collection) {
            boolean isAvailable = map.containsKey(item);
            if (!isAvailable) {
                map.put(item, count);
                System.out.println("Not available: " + item + " count = " + count);
            } else {
                int temp = map.get(item);
                map.put(item, ++temp);
                System.out.println("Available: " + item + " temp: " + temp);
            }
        }
        return map;
    }

    /**
     *
     * @param n количество результатов употреблений слов
     * @param list список значений "уникальное слово и кол-во употреблений".
     */
    public void wordsTop(int n, List list){



        Collections.sort(list, new Comparator<Map.Entry<String, Integer>> () {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        for (int i = 0; i < n; i++) {
            System.out.println("На " + (i+1) + " месте по количеству употреблений слово " + list.get(i));
        }


    }
}

