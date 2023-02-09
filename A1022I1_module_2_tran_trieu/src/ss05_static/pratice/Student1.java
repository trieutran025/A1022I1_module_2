package ss05_static.pratice;

public class Student1 {
    private int id;
    private String name;
    public static String className="A10";
    public static String language;

    public Student1() {
    }

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
//        className ="zzz";
//        abc();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.id +"-"+this.name+"-"+this.className;
    }

    public String getClassName() {
        return className;
    }

    public  void setClassName(String className) {
        this.className = className;
    }
    public static void abc(){}

    public static void main(String[] args) {
        abc();
        className="abc";
    }
}
