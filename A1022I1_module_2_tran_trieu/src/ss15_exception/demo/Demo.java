package ss15_exception.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void readFile() throws FileNotFoundException {
//        try {
//            FileReader fileReader = new FileReader("abc");
//        } catch (FileNotFoundException e) {
//            System.out.println("Khong tim thay file");
//        }
        FileReader fileReader = new FileReader("abc");
    }
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        int number1 =0;
        int number2 =0;
        try {
            System.out.print("Nhap mot so 1:");
            number1= Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap mot so 2:");
            number2=scanner.nextInt();
            if(number1==13||number2==13){
                throw new MyException();
            }
            System.out.println(number1/number2);
            return 11;
        }catch (InputMismatchException e){
            System.out.println("Phai nhap so ban nhe");
        }catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        } catch (MyException e){
            System.out.println("Khong duoc nhap 13");
        }catch (Exception e){
            System.out.println("Loi gi do");
        }finally {
            System.out.println("Ket thuc chuong trinh");
        }
        return 22;
    }
    public static void main(String[] args) {
        System.out.println(input());
//        readFile();
    }
}
