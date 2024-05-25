package n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private float totalPrice;

    public Sale(ArrayList<Product> products) {
        this.products = products;
        this.totalPrice = 0;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void calculateTotal(ArrayList<Product> products) throws EmptySaleException {
        if(products.isEmpty()) {
            throw new EmptySaleException("You need to add at least one product to make a sale.");
        } else {
            for (Product product : products) {
                totalPrice += product.getPrice();
            }
        }
    }

    public void causeIndexError(ArrayList<Product> products) throws IndexOutOfBoundsException {
        for(int i = 0; i <= products.size(); i++) {
            System.out.println(products.get(i).getPrice());
        }
    }
}
