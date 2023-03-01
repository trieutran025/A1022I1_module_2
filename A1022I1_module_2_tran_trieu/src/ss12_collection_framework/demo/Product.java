package ss12_collection_framework.demo;

public class Product implements Comparable<Product>{
    private String name;
    private long price ;

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if(this.price==o.getPrice()){
            return 0;
        }else if(this.price>o.getPrice()){
            return -99;
        }else {
            return 2;
        }
    }
}
