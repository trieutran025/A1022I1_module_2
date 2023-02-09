package ss04_opp.pratice;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
        this("no name");
        System.out.println(1);
    }

    public Student(String name) {
        System.out.println(2);
        this.name = name;
    }

    public Student(int id) {

        this.id = id;
    }

    public static void main(String[] args) {
        Student student2 = new Student();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
