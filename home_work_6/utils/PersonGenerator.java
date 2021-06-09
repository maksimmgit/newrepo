package home_work_6.utils;
/*
public class PersonGenerator<T> {
    Supplier<Person> random = Person::new;





    public List<Person> personList(int listLength){
        long start = System.currentTimeMillis();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            list.add(random.get());
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция ЗАПОЛНЕНИЕ " + list.getClass().getSimpleName() + " заняла " + (finish - start) + " МС");
        return list;
    }
    


    public LinkedList<Person> personLinkedList(int listLength){
        LinkedList<Person> linkedList = new LinkedList<>();
        for (int i = 0; i < listLength; i++) {
            linkedList.add(random.get());
        }
        return linkedList;
    }


    public Set<Person> personHashSet(int listLength){
        Set<Person> hashSet = new HashSet<>();
        for (int i = 0; i < listLength; i++) {
            hashSet.add(random.get());
        }
        return hashSet;
    }

    public TreeSet<Person> personTreeSet(int listLength){
        TreeSet<Person> treeSet = new TreeSet<>();
        for (int i = 0; i < listLength; i++) {
            treeSet.add(random.get());
        }
        return treeSet;
    }

    /*
    void sort(Comparator<? super T> comparator) {
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
     */


