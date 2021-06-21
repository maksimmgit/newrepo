package home_work_6.test;

import home_work_6.comparators.AnimalAgeComparator;
import home_work_6.dto.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AnimalAgeComparatorTest {

    @Test
    public void ageFirstLess(){
        Animal a1 = new Animal(20,"Имя1");
        Animal a2 = new Animal(25,"Имя2");
        Comparator<Animal> comparator = new AnimalAgeComparator();

        Assertions.assertEquals(-5, comparator.compare(a1,a2));
    }
    @Test
    public void ageSecondLess(){
        Animal a1 = new Animal(21,"Имя1");
        Animal a2 = new Animal(20,"Имя2");
        Comparator<Animal> comparator = new AnimalAgeComparator();

        Assertions.assertEquals(1, comparator.compare(a1,a2));
    }

    @Test
    public void ageEqual(){
        Animal a1 = new Animal(21,"Имя1");
        Animal a2 = new Animal(21,"Имя2");
        Comparator<Animal> comparator = new AnimalAgeComparator();

        Assertions.assertEquals(0, comparator.compare(a1,a2));
    }
}
