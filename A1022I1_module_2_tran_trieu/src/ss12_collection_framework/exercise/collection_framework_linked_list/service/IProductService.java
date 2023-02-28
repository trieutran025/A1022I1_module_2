package ss12_collection_framework.exercise.collection_framework_linked_list.service;


import ss12_collection_framework.exercise.collection_framework_array_list.model.Product;

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
