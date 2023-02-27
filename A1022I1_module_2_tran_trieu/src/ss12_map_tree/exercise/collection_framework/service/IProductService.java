package ss12_map_tree.exercise.collection_framework.service;


import ss12_map_tree.exercise.collection_framework.model.Product;

import java.util.List;

public interface IProductService {
    void setProduct(int id,String productName);
    void removeProduct(int id);
    void findProductName(String productName);
    void sortAscending();
    void sortDescending();
    void addProduct(Product product);

    List<Product> findAll();
}
