package home_work_6.utils;

import home_work_6.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class AnimalGenerator<T> {
    Supplier<Animal> random = Animal::new;

    public List<Animal> animalList(int listLength){
        List<Animal> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            list.add(random.get());
        }
        return list;
    }



}
