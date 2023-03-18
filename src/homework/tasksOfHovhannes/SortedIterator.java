package homework.tasksOfHovhannes;

import java.util.*;

public class SortedIterator<T> implements Comparable {
    private List<T> elements;
SortedIterator(List<T> list){
    elements = list;
}

    public static <T> SortedIterator<T> fromList(T[] array) {
        List<T> list = Arrays.asList(array);

        return null;
    }

    public static <T> SortedIterator<T> fromList(T[] array, Comparator<T> comparator) {
        return null;
    }

    boolean hasNext() {
        return false;
    }

    boolean next() {
        return false;
    }


    @Override
    public int compareTo(Object o) {
    this.elements.equals((T)o);
        return 0;
    }
}
