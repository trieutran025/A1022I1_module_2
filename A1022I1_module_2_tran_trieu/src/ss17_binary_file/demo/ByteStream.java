package ss17_binary_file.demo;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {

    public static final String FILE_PATH = "D:\\CodeGym\\module_2\\A1022I1_module_2\\A1022I1_module_2_tran_trieu\\src\\ss17_binary_file\\demo\\student.dtt";

    public static void writeObject(Student student) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }

    public static Student readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        ois.close();
        return student;
    }

    public static void writeObject(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        oos.close();
    }

    public static List<Student> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> studentList = (List<Student>) ois.readObject();
        ois.close();
        return studentList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Student student1 = new Student(1, "Hung", 99);
//        writeObject(student1);
//        System.out.println(readObject());

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Anh", 99));
        studentList.add(new Student(2, "Hung", 50));
        studentList.add(new Student(3, "Ban", 66));
        studentList.add(new Student(4, "Phim", 77));
        writeObject(studentList);
        List<Student> result = readObjectList();
        for (Student student : result){
            System.out.println(student);
        }
//        Student student1 = new Student(1,"Hung",99);
//        writeObject(student1);
//        System.out.println(readObject());
    }
}
