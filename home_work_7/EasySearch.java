package home_work_7;

import java.util.Iterator;
import java.util.List;

public class EasySearch {

    public void easySearch(String word, List<String> list) {
        int count = 0;

        for (String temp : list) {
            //String.valueOf(temp.indexOf(word));
            if (temp.indexOf(word) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }






}
