package n1exercici1;

public class Product {
    private String productName;
    private float price;

    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }
}
