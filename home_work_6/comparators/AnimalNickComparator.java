package home_work_6.comparators;

import home_work_6.dto.Animal;

import java.util.Comparator;

public class AnimalNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
