package codehub.bootcamp.assignment1.tester;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Customers.OnlineCustomer;
import codehub.bootcamp.assignment1.model.Orders.Order;
import codehub.bootcamp.assignment1.model.Products.Product;
import codehub.bootcamp.assignment1.model.Stores.OrdersInventoryRetailStore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Tester {

    public static void main(String[] args) throws FileNotFoundException {

        Product x1 = new Product("Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product("Chair. Luis XV", 100, 1000);

        Customer o1 = new OnlineCustomer("John","Jonny", OnlineCustomer.CustomerCategory.INDIVIDUAL);
        Customer o2 = new OnlineCustomer("Mary","Marriie", OnlineCustomer.CustomerCategory.BUSINESS);
        Customer o3 = new OnlineCustomer("Tom","Jerry", OnlineCustomer.CustomerCategory.GOVERNMENT);

        OrdersInventoryRetailStore mariaStore = new OrdersInventoryRetailStore();

        mariaStore.addItemToList(x1);
        mariaStore.addItemToList(x1);
        mariaStore.addItemToList(x2);
        mariaStore.addItemToList(x2);
        mariaStore.addItemToList(x2);
        mariaStore.addItemToList(x4);
        mariaStore.addItemToList(x4);

        Order order1 = mariaStore.Order2Test(o1,x2,"Cash");
        Order order2 = mariaStore.Order2Test(o1,x1,"Credit");
        Order order3 = mariaStore.Order2Test(o1,x4,"Cash");
        Order order4 = mariaStore.Order2Test(o2,x1,"Credit");
        Order order5 = mariaStore.Order2Test(o2,x2,"Cash");
        Order order6 = mariaStore.Order2Test(o2,x2,"Credit");
        Order order7 = mariaStore.Order2Test(o3,x4,"Credit");

        mariaStore.getCustomerProducts(o1);
        mariaStore.getCustomerProducts(o2);
        mariaStore.getCustomerProducts(o3);


        double totalProductCostOfTransactions = 0.0;
        int totalProductNumberOfTransactions = 0;

        for(Product product : x4.getListOfAllProducts()){
            totalProductCostOfTransactions += product.getTotalPurchases();
            totalProductNumberOfTransactions += product.getTotalNumberOfTransactions();
        }

        double totalCustomerCostOfTransactions = 0.0;
        int totalCustomerNumberOfTransactions = 0;

        for(Customer customer : o1.getListOfAllCustomers()) {

            totalCustomerCostOfTransactions += customer.getTotalCostOfPurchases();
            totalCustomerNumberOfTransactions += customer.getTotalNumberOfTransactions();
        }

        System.out.println("Customer named " + o1.getName() + " has made a total of " + o1.getTotalNumberOfTransactions() + " transactions and their total cost of purchases is " + o1.getTotalCostOfPurchases() +" €.");

        System.out.println("Prodcut named " + x1.getName() + " has been bought a total of " + x1.getTotalNumberOfTransactions() + " times and the total cost of purchases is " + x1.getTotalPurchases() + " €.");

        System.out.println("The total number of transactions for all customers is " + totalCustomerNumberOfTransactions + " and their total cost of all purchases is " + totalCustomerCostOfTransactions + "€.");

        System.out.println("The total number of purchases for all products is " + totalProductNumberOfTransactions + " and the total cost of all purchases is " + totalProductCostOfTransactions + "€.");

//Data to write in File using PrintWriter
        PrintWriter writer1 = null;
        writer1 = new PrintWriter(new File("C:\\Users\\AELGD\\Desktop\\test.txt"));
        writer1.write(("Customer named " + o1.getName() + " has made a total of " + o1.getTotalNumberOfTransactions() + " transactions and their total cost of purchases is " + o1.getTotalCostOfPurchases() +" €. \n"));
        writer1.write(("Prodcut named " + x1.getName() + " has been bought a total of " + x1.getTotalNumberOfTransactions() + " times and the total cost of purchases is " + x1.getTotalPurchases() + " €.\n"));
        writer1.write(("The total number of transactions for all customers is " + totalCustomerNumberOfTransactions + " and their total cost of all purchases is " + totalCustomerCostOfTransactions + "€.\n"));
        writer1.write(("The total number of purchases for all products is " + totalProductNumberOfTransactions + " and the total cost of all purchases is " + totalProductCostOfTransactions + "€."));

        writer1.flush();
        writer1.close();
    }

}
