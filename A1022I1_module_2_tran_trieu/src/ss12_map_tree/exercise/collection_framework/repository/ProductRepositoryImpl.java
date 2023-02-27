package ss12_map_tree.exercise.collection_framework.repository;


import ss12_map_tree.exercise.collection_framework.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository  {
    private static List<Product> productList;
    private static int nextId = 1;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(nextId++, "SmartPhone", 100000000));
        productList.add(new Product(nextId++, "Laptop computer", 20000000));
        productList.add(new Product(nextId++, "Desktop computer", 30000000));
        productList.add(new Product(nextId++, "Printer", 22200000));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void setProduct(int id, String productName) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setProductName(productName);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid product ID");
    }

    @Override
    public Product removeProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.remove(i);
            }
        }
        throw new IllegalArgumentException("Invalid product ID");
    }

    @Override
    public void findProductName(String productName) {
        for (Product product : productList) {
            if (product.getProductName().equals(productName)) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("No product found with name " + productName);
    }



    @Override
    public void sortAscending() {
        Collections.sort(productList, Comparator.comparing(Product::getProductPrice));
    }

    @Override
    public void sortDescending() {
        Comparator<Product> comparator = Comparator.comparing(Product::getProductPrice);
        Collections.sort(productList,comparator.reversed());
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }
}
