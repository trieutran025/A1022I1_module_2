package ss17_binary_file.exercise;





import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {

    public static final String FILE_PATH = "D:\\CodeGym\\module_2\\A1022I1_module_2\\A1022I1_module_2_tran_trieu\\src\\ss17_binary_file\\exercise\\product.dtt";

    public static void writeObject(List<Product> productList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
        oos.close();
    }

    public static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> productList = (List<Product>) ois.readObject();
        ois.close();
        return productList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 10000000));
        productList.add(new Product(2, "SmartPhone", 50000000));
        writeObject(productList);
//        List<Product> result = readObjectList();
//        for (Product product : result) {
//            System.out.println(product);
//        }
    }
}
