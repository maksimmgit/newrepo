package home_work_7.utils;

import home_work_7.api.ISearchEngine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasySearch implements ISearchEngine {
    //Первый параметр текст в котором ищем, второй параметр что ищем в тексте.
    @Override
    public long search(String text, String word) {
        return easySearch2(text, word);
    }



    /*
    Неправильный вариант с использованием регулярного выражения в text.split

    public long easySearch(String word, String text) {
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (String s: text.split(" ")) {
            list.add(s);
        }
        //List<String> list = new ArrayList<>(Arrays.asList(text.split("\\s+")));
        System.out.println("Распечатываем собранную коллекцию из строки " + list);

        for (String temp : list) {
            //String.valueOf(temp.indexOf(word));
            if (temp.indexOf(word) != -1) {
                count++;
            }
        }
        return count;
    }

     */


    /**
     * Сделано криво, но без регулярок решил использовать Stringbuilder.
     * Опять же, вручную вписывать символы для новой строки не очень нравится.
     * @param word принимаем слово для поиска
     * @param text принимаем текст для обработки в котором будем искать
     * @return количество совпадений
     */
    public long easySearch2(String word, String text){
        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        char[] c = text.toCharArray();
        int count = 0;

        //используя stringbuilder собираем char в слова.
        for(int i = 0; i < text.length(); i++){
            if(c[i] == ' ' || c[i] == '.' || c[i] == '!' || c[i] == '?'|| c[i] == ',' || c[i] == ';') {
                if(c[i-1]!=',' || c[i-1] != '.' || c[i-1] != '!' || c[i-1] != '?' || c[i-1] != ';') {
                    list.add(sb.toString());
                    sb = new StringBuffer();
                }
            }else{
                sb.append(c[i]);
            }

        }
        for (String temp : list) {
            //String.valueOf(temp.indexOf(word));
            if (temp.indexOf(word) != -1) {
                count++;
            }
        }
        //System.out.println("Распечатываем собранную коллекцию из массива символов " + list);
        return count;
    }



}
