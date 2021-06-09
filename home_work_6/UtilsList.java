package home_work_6;

import home_work_6.comparators.AnimalAgeComparator;
import home_work_6.comparators.AnimalNickComparator;
import home_work_6.comparators.PasswordUserComparator;
import home_work_6.comparators.UserNickComparator;
;

import java.util.*;
import java.util.function.Supplier;


public class UtilsList<T>   {
    private T[] data;
    public UtilsList(T[] init){
        this.data = init;
    }
    int listLength = 100;

    public UtilsList() {
        this.data = data;
    }




    Supplier<Person> random = Person::new;
    Supplier<Animal> random1 = Animal::new;
    List<Person> persList = personList(listLength);
    List<Animal> animList = animalList(listLength);


    /**
     * Создаем Arraylist и отдаем его.
     * @param listLength принимаем длину списка
     * @return возвращает ArrayList
     */
    public List<Person> personList(int listLength){
        long start = System.currentTimeMillis();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            list.add(random.get());
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция заполнение  " + list.getClass().getSimpleName() + " заняла " + (finish - start) + " МС");
        return list;
    }


    /**
     *
     * @param listLength    принимаем длину списка
     * @return  Возвращаем LinkedList
     */
    public LinkedList<Person> personLinkedList(int listLength){
        LinkedList<Person> linkedList = new LinkedList<>();
        for (int i = 0; i < listLength; i++) {
            linkedList.add(random.get());
        }
        return linkedList;
    }

    /**
     *
     * @param listLength    принимаем длину списка
     * @return  возвращаем Hashset
     */
    public Set<Person> personHashSet(int listLength){
        Set<Person> hashSet = new HashSet<>();
        for (int i = 0; i < listLength; i++) {
            hashSet.add(random.get());
        }
        return hashSet;
    }

    /**
     *
     * @param listLength принимаем длину списка
     * @return  возвращаем Treeset
     */
    public TreeSet<Person> personTreeSet(int listLength){
        TreeSet<Person> treeSet = new TreeSet<>();
        for (int i = 0; i < listLength; i++) {
            treeSet.add(random.get());
        }
        return treeSet;
    }


    /**
     * Создаем Arraylist и отдаем его.
     * @param listLength принимаем длину списка
     * @return возвращает ArrayList
     */
    public List<Animal> animalList(int listLength){
        long start = System.currentTimeMillis();
        List<Animal> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            list.add(random1.get());
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция заполнение списка животных " + list.getClass().getSimpleName() + " заняла " + (finish - start) + " мс");
        return list;
    }

    /**
     *
     * @param listLength    принимаем длину списка
     * @return  linkedList
     */
    public LinkedList<Animal> animalLinkedList(int listLength){
        LinkedList<Animal> linkedList = new LinkedList<>();
        for (int i = 0; i < listLength; i++) {
            linkedList.add(random1.get());
        }
        return linkedList;
    }

    /**
     *
     * @param listLength    принимаем длину списка
     * @return  возвращаем Hashset
     */
    public Set<Animal> animalHashSet(int listLength){
        Set<Animal> hashSet = new HashSet<>();
        for (int i = 0; i < listLength; i++) {
            hashSet.add(random1.get());
        }
        return hashSet;
    }

    /**
     *
     * @param listLength принимаем длину списка
     * @return  возвращаем Treeset
     */
    public TreeSet<Animal> animalTreeSet(int listLength){
        TreeSet<Animal> treeSet = new TreeSet<>();
        for (int i = 0; i < listLength; i++) {
            treeSet.add(random1.get());
        }
        return treeSet;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    /**
     * Сортируем пароли компаратором. Передаём persList - сохраненный заранее список пользователей.
     */
    public void collectionSortPassword() {
        long start = System.currentTimeMillis();
        persList.sort(new PasswordUserComparator());
        long finish = System.currentTimeMillis();
        System.out.println("Сортировка паролей юзеров  " + persList.getClass().getSimpleName() + " 1 компаратором заняла " + (finish - start) + " мс");
        System.out.println(persList.toString());
    }


    /**
     * Сортируем пароли, а затем ники. Передаём persList - сохраненный заранее список пользователей.
     */
    public void collectionSortUserNick() {
        long start = System.currentTimeMillis();
        persList.sort(new PasswordUserComparator().thenComparing(new UserNickComparator()));
        long finish = System.currentTimeMillis();
        System.out.println("Сортировка паролей и ников" + persList.getClass().getSimpleName() + " 2 компараторами заняла " + (finish - start) + " мс");
        System.out.println(persList.toString());
    }

    public void collectionSortAnimalAge() {
        long start = System.currentTimeMillis();
        animList.sort(new AnimalAgeComparator());
        long finish = System.currentTimeMillis();

        System.out.println("Сортировка возраста животных" + animList.getClass().getSimpleName() + " 1 компаратором заняла " + (finish - start) + " мс");

        System.out.println(animList.toString());
    }

    public void collectionSortAnimalAgeNick() {
        long start = System.currentTimeMillis();
        animList.sort(new AnimalAgeComparator().thenComparing(new AnimalNickComparator()));
        long finish = System.currentTimeMillis();
        System.out.println("Сортировка возраста животных, а потом ников" + animList.getClass().getSimpleName() + " 2 компараторами заняла " + (finish - start) + " мс");
        System.out.println(animList.toString());
    }

    /**
     *
     * @param collection принимает коллекцию (сохраняется в переменную выше) и обрабатывает её итератором
     * @param i код для выбора. 0 перебирает коллекцию, 1 удаляет, остальные приводят к сообщению об ошибке.
     *          можно было бы через try catch попробовать в принципе
     */
    public void iter(Collection<T> collection, int i){
        long start = System.currentTimeMillis();
        Iterator<T> iter1 = collection.iterator();
        if(i == 0) {
            while (iter1.hasNext()) {
                System.out.println(iter1.next());
                iter1.next();
            }
            long finish = System.currentTimeMillis();
            System.out.println(("Операция итерирование  " + collection.getClass().getSimpleName() + " заняла " + (finish - start) + " мс"));
        }else if(i == 1){
            while(iter1.hasNext()){
                iter1.next();
                iter1.remove();
            }
            long finish = System.currentTimeMillis();
            System.out.println(("Операция удаление с помощью итератора  " + collection.getClass().getSimpleName() + " заняла " + (finish - start) + " мс"));
        }else{
            System.out.println("Неправильный запрос итератора");
        }
    }


    public void collectionCheck(Collection<T> collection){
        long start = System.currentTimeMillis();
        Object[] toArray  = collection.toArray();
        for (int i = 0; i < collection.size(); i++) {
            Object obj = toArray[i];
        }
        long finish = System.currentTimeMillis();
        System.out.println(("Операция перебор массива без итератора " + collection.getClass().getSimpleName() + " заняла " + (finish - start) + " мс"));
    }

    public void collectionRemove(Collection<T> collection){
        long start = System.currentTimeMillis();
        collection.clear();
        long finish = System.currentTimeMillis();
        System.out.println(("Операция удаление коллекции без итератора " + collection.getClass().getSimpleName() + " заняла " + (finish - start) + " мс"));
    }



    public void sort(Comparator<? super T> comparator) {
            for (int i = 0; i < this.data.length - 1; i++) {
                int minIndex = i;
                for (int j = i +1; j < this.data.length; j++) {
                    if (comparator.compare(this.data[j], this.data[minIndex]) < 0){
                        minIndex = j;
                    }
                }
                T tmp = this.data[i];
                this.data[i] = this.data[minIndex];
                this.data[minIndex] = tmp;
            }
    }

}
