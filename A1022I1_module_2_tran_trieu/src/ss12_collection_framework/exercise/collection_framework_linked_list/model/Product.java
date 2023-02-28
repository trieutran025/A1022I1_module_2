package ss12_collection_framework.exercise.collection_framework_linked_list.model;


import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id;
    private String productName;
    private long productPrice;

    public Product(int id, String productName, long productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public Product(String productName, long productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Product o) {
        return this.id - o.getId();
    }
}
