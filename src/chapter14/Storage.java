package chapter14;

public class Storage<K> {

    Object[] objects = new Object[10];
    int size;

    public void add(K obj) {
        if (objects.length == size) {
            extend();
        }
        objects[size++] = obj;
    }

    private void extend() {
        Object[] tmp = new Object[objects.length + 10];
        System.arraycopy(objects, 0, tmp, 0, size);
        objects = tmp;
    }

    public K getByIndex(int index) {
        return (K) objects[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }

}