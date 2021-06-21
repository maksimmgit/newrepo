package home_work_6.test;

import home_work_6.comparators.UserNickComparator;
import home_work_6.dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class UserNickComparatorTest {


    /**
     * Напомню:
     * -1 - a1 больше
     *  0 - равны
     *  1 - a2 больше
     */
    @Test
    public void secondNickGreater(){
        Person p1 = new Person("Ник33f","12345622");
        Person p2 = new Person("Ник2","123456");
        Comparator<Person> comparator = new UserNickComparator();

        Assertions.assertEquals(1,comparator.compare(p1,p2));

    }

    /*
    ошибка, actual -12, что не так?
    @Test
    public void firstNickGreater(){
        Person p1 = new Person("Аик123","12345622");
        Person p2 = new Person("Мик","123456");
        Comparator<Person> comparator = new UserNickComparator();

        Assertions.assertEquals(-1,comparator.compare(p1, p2));



    }

     */


}
