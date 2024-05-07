package n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private float totalPrice;

    public void calculateTotal(ArrayList<Product> products) throws EmptySaleException {

            for (Product product : products) {
                totalPrice += product.getPrice();
            }

            // System.out.println("You need to add at least one product to make a sale.");


    }
}
