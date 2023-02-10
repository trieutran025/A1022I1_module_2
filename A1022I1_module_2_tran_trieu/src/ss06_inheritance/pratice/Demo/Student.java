package ss06_inheritance.pratice.Demo;

public class Student extends Person{
    public Student() {
        super(99,"no name");
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                '}';
    }

}
