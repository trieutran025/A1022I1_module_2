package ss12_collection_framework.exercise.collection_framework_array_list.service;



import ss12_collection_framework.exercise.collection_framework_array_list.model.Product;
import ss12_collection_framework.exercise.collection_framework_array_list.repository.IProductRepository;
import ss12_collection_framework.exercise.collection_framework_array_list.repository.ProductRepositoryImpl;

import java.util.List;


public class ProductServiceImpl implements IProductService {
    private IProductRepository repository = (IProductRepository) new ProductRepositoryImpl();


    @Override
    public void setProduct(int id,String productName) {
        repository.setProduct(id, productName);
    }

    @Override
    public void removeProduct(int id) {
        repository.removeProduct(id);
    }

    @Override
    public void findProductName(String productName) {
        repository.findProductName(productName);
    }

    @Override
    public void sortAscending() {
        repository.sortAscending();
    }

    @Override
    public void sortDescending() {
        repository.sortDescending();
    }

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}
