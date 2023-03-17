package ss16_io_text_file.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static final String FILE_PATH = "D:\\Codegym\\module_2\\A1022I1_module_2\\A1022I1_module_2_tran_trieu\\src\\ss16_io_text_file\\demo\\student.csv";

    public static List<Student> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        List<Student> studentList = new ArrayList<>();
        String line = "";
        String temp[];
        Student student;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            double point = Double.parseDouble(temp[2]);

            student = new Student(id, name, point);
            studentList.add(student);
        }
        buff.close();
        return studentList;
    }

    public static void writeCSV(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH,true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(student.getId() + "," + student.getName() + "," + student.getPoint() + "\n");
        buff.close();
    }

    public static void main(String[] args) throws IOException {
//        List<Student> studentList = readCSV();
//        for(Student student :studentList){
//            System.out.println(student);
//        }
        Student student = new Student(33,"Tom",55);
        writeCSV(student);
    }
}
