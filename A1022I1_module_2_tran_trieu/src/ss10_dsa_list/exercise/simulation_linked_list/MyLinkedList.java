package ss10_dsa_list.exercise.simulation_linked_list;


import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Node<E> head;
    private Node<E> tail;
    private int sumNodes;

    public MyLinkedList() {
        this(DEFAULT_CAPACITY);
        head = null;
        tail = null;
        sumNodes = 0;
    }

    public MyLinkedList(int defaultCapacity) {
        Object[] temp = new Object[defaultCapacity];
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(null, element, null);
        if (sumNodes == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        sumNodes++;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(null, element, null);
        newNode.next =  head;
        head = newNode;
        sumNodes++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(null, element, null);
        newNode.prev = tail;
        newNode.next = null;
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        sumNodes++;
    }

    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (MyLinkedList.Node x = head; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (MyLinkedList.Node x = head; x != null; x = x.next) {
                if (element.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(E element) {
        boolean b = indexOf(element) != -1;
        return b;
    }

    public E getFirst() {
        final MyLinkedList.Node f = head;
        if (f == null)
            throw new NoSuchElementException();
        return (E) f.item;
    }

    public E getLast() {
        final Node<E> last = tail;
        if (last == null)
            throw new NoSuchElementException();
        return last.item;
    }

    public E get(int index) {
        if (index < 0 || index >= sumNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    public E remove(int index) {
        if (index < 0 || index >= sumNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            if (i == index) {
                current = current.next;
            }
        }
        sumNodes--;
        return current.item;
    }

    public boolean remove(E element) {
        if (element == null) {
            for (MyLinkedList.Node x = head; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (MyLinkedList.Node x = head; x != null; x = x.next) {
                if (element.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    E unlink(MyLinkedList.Node x) {
        // assert x != null;
        final E element = (E) x.item;
        final MyLinkedList.Node next = x.next;
        final MyLinkedList.Node prev = x.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        sumNodes--;
        return element;
    }

    public int size() {
        return sumNodes;
    }

    public void clear() {

        for (MyLinkedList.Node x = head; x != null; ) {
            MyLinkedList.Node next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        head = tail = null;
        sumNodes = 0;
    }
//    LinkedList


    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();

        // traverse the original list and add each element to the clone list
        Node<E> current = head;
        while (current != null) {
            cloneList.addLast(current.item);
            current = current.next;
        }

        return cloneList;
    }


    private class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}