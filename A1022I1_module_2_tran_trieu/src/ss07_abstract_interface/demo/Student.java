package ss07_abstract_interface.demo;

public class Student extends Person{
    @Override
    public void love() {
        System.out.println("Tinh yeu hoc tro");
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.love();
    }
}
