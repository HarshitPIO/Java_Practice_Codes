package abhyas.dayXVI.Assignment3;

public class Product {
    private String ProductName;
    private Double price;
    public Product(String name, Double price) {
        this.ProductName = name;
        this.price = price;
    }
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
