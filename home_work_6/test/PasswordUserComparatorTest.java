package home_work_6.test;

import home_work_6.comparators.PasswordUserComparator;
import home_work_6.dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class PasswordUserComparatorTest {
    /**
     * При отрицательном результате длина пароля p2>p1
     */

    @Test
    public void secondPassGreater(){
        Person p1 = new Person("Пупа", "12345");
        Person p2 = new Person("Лупа","123456");
        Comparator<Person> comparator = new PasswordUserComparator();

        Assertions.assertEquals(-1, comparator.compare(p1,p2));
    }

    @Test
    public void firstPassGreater(){
        Person p1 = new Person("Пупа```", "1234567");
        Person p2 = new Person("Лупа","12345");
        Comparator<Person> comparator = new PasswordUserComparator();

        Assertions.assertEquals(2, comparator.compare(p1,p2));
    }

    @Test
    public void equal(){
        Person p1 = new Person("Пупа", "12345@");
        Person p2 = new Person("Пупа","12345$");
        Comparator<Person> comparator = new PasswordUserComparator();

        Assertions.assertEquals(0, comparator.compare(p1,p2));
    }
}
