package home_work_7.test;

import home_work_7.api.ISearchEngine;
import home_work_7.utils.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest {

    static String testString = "привет, как дела!";
    static String testString2 = "привет,какдела!";
    static String testString3 = "привет;какдела!";
    static String testString4 = "как дела!.Что делаешь?";

    @Test
    public void test1(){
        ISearchEngine searchEngine = new home_work_7.utils.RegExSearch();

        Assertions.assertEquals(1, searchEngine.search("привет", testString));
    }

    @Test
    public void test2(){
        ISearchEngine searchEngine = new home_work_7.utils.RegExSearch();

        Assertions.assertEquals(1, searchEngine.search("привет", testString2));
    }

    @Test
    public void test3(){
        ISearchEngine searchEngine = new home_work_7.utils.RegExSearch();

        Assertions.assertEquals(1, searchEngine.search("привет", testString3));
    }

    @Test
    public void test4(){
        ISearchEngine searchEngine = new home_work_7.utils.RegExSearch();

        Assertions.assertEquals(0, searchEngine.search("привет", testString4));
    }

}
