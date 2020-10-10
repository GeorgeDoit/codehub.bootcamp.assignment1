package codehub.bootcamp.assignment1.tester;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Customers.OnlineCustomer;
import codehub.bootcamp.assignment1.model.Products.Product;
import codehub.bootcamp.assignment1.model.Stores.InventoryRetailStore;
import codehub.bootcamp.assignment1.model.Stores.Store;

public class Tester {

    public static void main(String[] args) {

        Product x1 = new Product("Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product("Chair. Luis XV", 100, 1000);
        System.out.println(x4.getName() + " has id=" + x4.getId());
        Store dismosStore = new InventoryRetailStore();
        dismosStore.buy(x1);
        dismosStore.buy(x4);
        dismosStore.sell(x1);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
        dismosStore.sell(x1);
        dismosStore.sell(x2);
        x4.setAvailable(false);
        dismosStore.buy(x4);
        dismosStore.sell(x4);
        dismosStore.buy(x4);
        dismosStore.sell(x4);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
        dismosStore.clearOutInventory();
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());



    }
}
