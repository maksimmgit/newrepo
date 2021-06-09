package home_work_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class DataContainer<T>{

    private T[] data;


    //пункт 3.Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[])
    //передаем массив
    public DataContainer(T[] init){
        this.data = init;
    }



    //пункт 4.  добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные, начиная с 0.
    public int add(T item){
        int index = data.length;

        // проверка на null
        if (item == null) return -1;

        // цикл ищет null и вставляет значение
        for (int i = 0; i < index; i++) {
            if (data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        // проверка на переполнение и вставка элемента
        this.data = Arrays.copyOf(data, index + 1);
        data[index] = item;
        return index;
    }


    //пункт 5   получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.

    /**
     *
     * @param index индекс элемента в массиве
     * @return data - необходимый элемент, null - ничего.
     */
    public T get(int index){
        if(index > -1 && index < this.data.length){
            return this.data[index];
        } else {
            return null;
        }
    }



    //пункт 6.метод T[] getItems(). Данный метод возвращает поле data.
    public T[] getItems(){
        return this.data;
    }

    //пункт 7. метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу
    /**
     *
     * @param index ищем элемент по индексу в массиве
     * @return  true - если нашли, false - если не нашли.
     */
    public boolean delete(int index){
        if(index > -1 && index < this.data.length){
            for (int i = index; i < data.length-1; i++) {
                data[i] = data[i+1];

            }
            data = Arrays.copyOf(data, data.length-1);

            return true;
        } else {
            return false;
        }

    }


    //пункт 8.метод boolean delete(T item) который будет удалять элемент из нашего поля data.
    /**
     *
     * @param item  элемент для поиска
     * @return true - если нашли, false - если не нашли.
     */
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if(Objects.equals(data[i], item)){
                delete(i);
                return true;
                }else{
                return false;
            }
        }
        return false;
    }

//       //поставить копию?
//   public T[] getList() {
//       return data;
//   }




    //пункт 9 метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
    /**
     *
     * @param comparator сравнивает два объекта и:
     *        this.data[j] < this.data[minIndex] результат -1
     *        this.data[j] == this.data[minIndex] результат 0
     *        this.data[j] > this.data[minIndex] результат 1
     */

    public void sort(Comparator<? super T> comparator){
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



    //Пункт 10,Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
    /**
     *
     * @return возвращает сформированную строку
     *
     */

    @Override
    public String toString() {
        StringBuilder containerToString = new StringBuilder(data.length);
        containerToString.append("containerContent{");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null){
                containerToString.append(data[i]);
            }
            if ((i != data.length-1) && data[i+1] != null){
                containerToString.append(", ");
            }
        }
        containerToString.append("}");
        return containerToString.toString();
    }


    //11.* В даном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
    // который будет принимать объект DataContainer с дженериком extends Comparable.
    // Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
    public static<R extends Comparable> void sort(DataContainer<R> container){
        if(container!=null){
            for (int i = 0; i < container.data.length - 1; i++) {
                int minIndex = i;
                for (int j = i +1; j < container.data.length; j++) {
                    if (container.data[j].compareTo(container.data[minIndex]) < 0){
                        minIndex = j;
                    }
                }
                R tmp = container.data[i];
                container.data[i] = container.data[minIndex];
                container.data[minIndex] = tmp;
            }
        }

    }

    //12 принимать объект DataContainer и реализацию интерфейса Comparator
    //сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
    public static <R> void sort(DataContainer <R> container, Comparator<? super  R> comparator){
        if(container!=null){
            for (int i = 0; i < container.data.length - 1; i++) {
                int minIndex = i;
                for (int j = i +1; j < container.data.length; j++) {
                    if (comparator.compare(container.data[j], container.data[minIndex]) < 0){
                        minIndex = j;
                    }
                }
                R tmp = container.data[i];
                container.data[i] = container.data[minIndex];
                container.data[minIndex] = tmp;
            }
        }
    }


    //13Реализовать в DataContainer интерфейс Iterable

    /**
     *
     * @return  it - возвращает интерфейс(?)
     * С помощью next() получаем следующий элемент
     * С помощью hasNext() проверяем существует ли он вообще.
     * Запуск в очередности hasNext()->next(), иначе ошибка NoSuchElementException
     *
     */
    public Iterator<T> iterator(){
        Iterator<T> it = new Iterator<>() {

            private int currentIndex;


            @Override
            public boolean hasNext() {
                return currentIndex< data.length && data[currentIndex] !=null;
            }

            @Override
            public T next() {
                return data[currentIndex++];
            }

        };  //почему?
        return it;
    }


}
