package ss10_dsa_list.exercise.simulation_array_list;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E element) {
        if (size == elements.length) {
            Object[] newElements = new Object[size * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == elements.length) {
            Object[] newElements = new Object[size * 2];
            System.arraycopy(elements, index, newElements, 0, size);
            elements = newElements;
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    public int size() {
        return size;
    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object removeElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[--size] = null;
        return (E) removeElement;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) return i;
        }
        return -1;
    }

    @Override
    public MyList<E> clone() throws CloneNotSupportedException {
        MyList<E> clonedList = new MyList<>(this.size());
        clonedList.elements = elements.clone();
        clonedList.size = size;
        return clonedList;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
}
