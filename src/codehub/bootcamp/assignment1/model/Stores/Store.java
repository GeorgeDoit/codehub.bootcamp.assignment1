package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Products.Product;

public interface Store {
    void buy(Product product);
    void sell(Product product);

    double getRevenue();
    void clearOutInventory();
    void showInventory();

}
