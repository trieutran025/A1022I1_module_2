package ss04_opp.pratice;

public class Test {
    public static void main(String[] args) {
//        Student student1 = new Student(1,"Hung");
        Student student2= new Student();
        System.out.println(student2.getName());
        student2.setName("Minh");
        System.out.println(student2.getName());
        Student student3 = new Student(10);
        System.out.println(student3.getId());
        Student student4= new Student("An");
        System.out.println(student4.getName());
    }
}
