package ss12_collection_framework.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("mi tom",3000);
        Product product2 = new Product("nuoc ngot",5000);
        Product product3 = new Product("banh my",1000);
        Product product4 = new Product("tra sua",9000);
        Product product5 = new Product("banh trang",7000);
        List<Product> myList = new ArrayList<>();
        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        myList.add(product4);
        myList.add(product5);

        for (Product product: myList) {
            System.out.println(product);
        }
        System.out.println("---------------------------------");
//        Collections.sort(myList);
        Collections.sort(myList,new ProductSortByPrice());
        for (Product product: myList) {
            System.out.println(product);
        }
    }
}
