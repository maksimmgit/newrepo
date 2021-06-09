package home_work_6.comparators;

import home_work_6.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge()- o2.getAge();
    }
}
