package ss10_dsa_list.exercise.simulation_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Trieu");
        myLinkedList.addFirst(4);
        myLinkedList.addLast(12);
        myLinkedList.add(123);
        myLinkedList.remove(1);
        myLinkedList.remove("Trieu");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
//        MyLinkedList myLinkedList1 = myLinkedList.clone();
//        System.out.println(myLinkedList1.size());
    }
}
