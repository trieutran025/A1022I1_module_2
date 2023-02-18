package ss09_dsa_list.exercise;

public class MyListTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyList myList = new MyList();
        myList.add(5);
        myList.add(2);
        myList.add(6);
        myList.add(0,"Tran Trieu");
        myList.add(1,20);
        myList.clear();
        myList.remove(3);
        for (int i = 0; i < myList.size() ; i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.contains(3));
        System.out.println(myList.indexOf(21));

    }
}
