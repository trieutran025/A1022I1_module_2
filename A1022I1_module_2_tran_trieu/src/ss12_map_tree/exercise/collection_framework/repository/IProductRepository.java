package ss12_map_tree.exercise.collection_framework.repository;


import ss12_map_tree.exercise.collection_framework.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void setProduct(int  id, String productName);
    Object removeProduct(int id);
    void findProductName(String productName);
    void sortAscending();
    void sortDescending();
    void addProduct(Product product);
}
