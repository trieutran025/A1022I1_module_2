package Ss05_static.exercise;

public class Student {
    private String name="John";
    private String classes="A10";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public static class Test{
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Haley");
            student.setClasses("A13");
        }
    }
}
