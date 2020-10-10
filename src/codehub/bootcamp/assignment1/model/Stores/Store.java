package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Products.Product;

public interface Store {
    boolean buy(Product product);
    boolean sell(Product product);

    double getRevenue();
    void clearOutInventory();
    void showInventory();

}
