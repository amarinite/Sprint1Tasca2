package n1exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("mouse", 25.99f);
        Product product2 = new Product("keyboard", 27.99f);
        Product product3 = new Product("laptop", 294.99f);

        ArrayList<Product> products = new ArrayList<Product>();

        Sale sale1 = new Sale(products);

        try {
            sale1.calculateTotal(sale1.getProducts());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}