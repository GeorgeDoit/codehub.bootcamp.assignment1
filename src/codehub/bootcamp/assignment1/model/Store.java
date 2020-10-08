package codehub.bootcamp.assignment1.model;

public interface Store {
    void buy(Product product);
    void sell(Product product);

    double getRevenue();
    void clearOutInventory();
    void showInventory();

}
