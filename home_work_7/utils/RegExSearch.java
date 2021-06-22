package home_work_7.utils;

import home_work_7.FileReader;
import home_work_7.api.ISearchEngine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /**
     *
     * @param text который ищем
     * @param word строка в которой ищем
     * @return количество найденных результатов
     */
    @Override
    public long search(String text, String word) {
        FileReader fileReader = new FileReader();
        fileReader.stringCleaner(Arrays.toString(word.split(" ")));

        long count = 0;
        Pattern pattern = Pattern.compile(text);
        Matcher matcher = pattern.matcher(word);

        while(matcher.find()){
            count++;
        }
        return count;
    }

}
