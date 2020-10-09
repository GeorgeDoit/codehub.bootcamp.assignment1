package codehub.bootcamp.assignment1.App;

import codehub.bootcamp.assignment1.model.Products.Product;
import codehub.bootcamp.assignment1.model.Stores.InventoryRetailStore;
import codehub.bootcamp.assignment1.model.Stores.Store;

public class Application {

    public static void main(String[] args) {

//        Tester t = new Tester();
//        t.TestCode();

//        Product x1 = new Product("Painting Picasso.Guernica",100,1000);
//        Product x2 = new Product("Painting Tsarouxis. Naftis A",200,2000);
//        Product x4 = new Product("Chair. Luis XV");
//
//        x4.setPriceWhenBuy(100);
//        x4.setPriceWhenSell(1000);
//
//        Store mariaStore = new InventoryRetailStore();
//        x1.setAvailable(false);
//        mariaStore.buy(x1);
//        mariaStore.buy(x2);
//        mariaStore.buy(x2);
//        mariaStore.buy(x4);
//        mariaStore.sell(x1);
//        x4.setAvailable(false);
//        mariaStore.sell(x2);
//        mariaStore.sell(x4);
//        System.out.println(mariaStore.getRevenue());
//        mariaStore.sell(x2);
//        mariaStore.sell(x2);
//        mariaStore.sell(x2);
//        System.out.println(mariaStore.getRevenue());

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
        // ADDING x2 so we can see clearOutInventory() working!!!
        dismosStore.buy(x2);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
        dismosStore.clearOutInventory();
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());




    }
}
