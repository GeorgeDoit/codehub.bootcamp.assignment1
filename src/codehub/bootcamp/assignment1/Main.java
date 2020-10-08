package codehub.bootcamp.assignment1;

import codehub.bootcamp.assignment1.model.*;
import codehub.bootcamp.assignment1.tester.Tester;

public class Main {

    public static void main(String[] args) {
	// write your code here!
//        Tester t = new Tester();
//        t.TestCode();

        Product x1 = new Product("Painting Picasso.Guernica",100,1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A",200,2000);
        Product x4 = new Product("Chair. Luis XV",100,1000);

//        Store mariaStore = new InventoryRetailStore();
//        x1.setAvailability(false);
//        mariaStore.buy(x1);
//        mariaStore.buy(x2);
//        mariaStore.buy(x2);
//        mariaStore.buy(x4);
//        mariaStore.sell(x1);
//        x4.setAvailability(false);
//        mariaStore.sell(x2);
//        mariaStore.sell(x4);
//        System.out.println(mariaStore.getRevenue());
//        mariaStore.sell(x2);
//        mariaStore.sell(x2);
//        mariaStore.sell(x2);
//        System.out.println(mariaStore.getRevenue());


        Store dismosStore = new InventoryRetailStore();
        dismosStore.buy(x1);
        dismosStore.buy(x4);
        dismosStore.sell(x1);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
        dismosStore.sell(x1);
        dismosStore.sell(x2);
        x4.setReserved(true);
        dismosStore.sell(x4);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());


    }
}