package codehub.bootcamp.assignment1.tester;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Customers.OnlineCustomer;
import codehub.bootcamp.assignment1.model.Orders.Order2;
import codehub.bootcamp.assignment1.model.Products.Product;
import codehub.bootcamp.assignment1.model.Stores.OrdersInventoryRetailStore;

public class Tester {

    public static void main(String[] args) {

        Product x1 = new Product("Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product("Chair. Luis XV", 100, 1000);

        Customer c = new Customer("George");

        Customer o1 = new OnlineCustomer("John","Jonny", OnlineCustomer.CustomerCategory.INDIVIDUAL);
        Customer o2 = new OnlineCustomer("Mary","Marriie", OnlineCustomer.CustomerCategory.BUSINESS);
        Customer o3 = new OnlineCustomer("Tom","Jerry", OnlineCustomer.CustomerCategory.GOVERNMENT);

        OrdersInventoryRetailStore mariaStore = new OrdersInventoryRetailStore();

        mariaStore.addItemToList(x1);
        mariaStore.addItemToList(x1);
        mariaStore.addItemToList(x1);
        mariaStore.addItemToList(x2);
        mariaStore.addItemToList(x2);
        mariaStore.addItemToList(x4);
        mariaStore.addItemToList(x4);

        Order2 order1 = mariaStore.Order2Test(o1,x2);
        Order2 order4 = mariaStore.Order2Test(o1,x1);
        Order2 order41 = mariaStore.Order2Test(o1,x1);
        Order2 order2 = mariaStore.Order2Test(o2,x4);
        Order2 order3 = mariaStore.Order2Test(o3,x1);
        Order2 order10 = mariaStore.Order2Test(c,x4);


        Order2 order5 = mariaStore.Order2Test(o2,x2);
        Order2 order6 = mariaStore.Order2Test(o3,x4);


        mariaStore.getCustomerProducts(o1);
        mariaStore.getCustomerProducts(o2);
        mariaStore.getCustomerProducts(o3);
        mariaStore.getCustomerProducts(c);





        //Customer named Ioannis has made a total of 2 transactions and their total cost of purchases is 300.0€.
        //                Product named Painting Tsarouxis. Naftis A has been bought a total of 2 times and the total cost of purchases is 400.0€.
        //                The total number of transactions for all customers is 4 and their total cost of all purchases is 600.0€.
        //                The total number of purchases for all products is 4 and the total cost of all purchases is 600.0€.
    }
}
