package home_work_6.test;

import home_work_6.comparators.AnimalNickComparator;
import home_work_6.dto.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AnimalNickComparatorTest {

    /**
     * Напомню:
     * -1 - a1 больше
     *  0 - равны
     *  1 - a2 больше
     */
    @Test
    public void firstNickGreater(){
        Animal a1 = new Animal(20,"Имя1");
        Animal a2 = new Animal(20,"Имя222");
        Comparator<Animal> comparator = new AnimalNickComparator();

        Assertions.assertEquals(-1, comparator.compare(a1, a2));
    }

    @Test
    public void secondNickGreater(){
        Animal a1 = new Animal(20,"Имя2");
        Animal a2 = new Animal(210,"Имя1");
        Comparator<Animal> comparator = new AnimalNickComparator();

        Assertions.assertEquals(1, comparator.compare(a1, a2));
    }

    @Test
    public void nicksAreEquals(){
        Animal a1 = new Animal(199,"Имя22");
        Animal a2 = new Animal(210,"Имя22");
        Comparator<Animal> comparator = new AnimalNickComparator();

        Assertions.assertEquals(0, comparator.compare(a1, a2));
    }
}
