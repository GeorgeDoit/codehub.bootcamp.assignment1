package codehub.bootcamp.assignment1.model.Customers;

import codehub.bootcamp.assignment1.model.Orders.Order2;
import codehub.bootcamp.assignment1.model.Products.Product;
import codehub.bootcamp.assignment1.model.Stores.OrdersInventoryRetailStore;
import codehub.bootcamp.assignment1.model.Stores.Store;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private double totalCashPurchases;
    private double totalCreditPurchases;
    private int totalNumberOfTransactions;
    private double totalCostOfPurchases;

    public static List<Customer> listOfCustomers = new ArrayList<Customer>();
    public List<Product> customerProducts = new ArrayList<>();



    public Customer(String name) {
        this(name, 0.0, 0.0, 0, 0.0);
        this.name = name;
        this.totalCashPurchases = 0.0;
        this.totalCreditPurchases = 0.0;
        this.totalNumberOfTransactions = 0;
        this.totalCostOfPurchases = 0.0;

    }

    public Customer(String name, double totalCashPurchases, double totalCreditPurchases, int totalNumberOfTransactions,double totalCostOfPurchases){
        this.name = name;
        this.totalCashPurchases = totalCashPurchases;
        this.totalCreditPurchases = totalCreditPurchases;
        this.totalNumberOfTransactions = totalNumberOfTransactions;
        this.totalCostOfPurchases = totalCostOfPurchases;
        listOfCustomers.add(this);
    }

    public static List<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public String getName() {
        return name;
    }

    public double getTotalCashPurchases() {
        return totalCashPurchases;
    }

    public double getTotalCreditPurchases() {
        return totalCreditPurchases;
    }

    public int getTotalNumberOfTransactions() {
        return totalNumberOfTransactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalCashPurchases(double totalCashPurchases) {
        this.totalCashPurchases += totalCashPurchases;
    }

    public double getTotalCostOfPurchases() {
        return totalCostOfPurchases;
    }

    public void setTotalCostOfPurchases(double totalCostOfPurchases) {
        this.totalCostOfPurchases += totalCostOfPurchases;
    }

    public void setTotalCreditPurchases(double totalCreditPurchases) {
        this.totalCreditPurchases += totalCreditPurchases;
    }

    public void setTotalNumberOfTransactions(int totalNumberOfTransactions) {
        this.totalNumberOfTransactions += totalNumberOfTransactions;
    }
    OrdersInventoryRetailStore mariaStore = new OrdersInventoryRetailStore();

    public boolean buyInCash = false;

    public void buyInCash(Product product, Store store) {

        setTotalCashPurchases(product.getPriceWhenSell());
        setTotalNumberOfTransactions(1);
        product.setTotalPurchases(product.getPriceWhenSell());
        product.setTotalNumberOfTransactions(1);
        showBuyingMessage(product.getName() , product.getPriceWhenSell());
        buyInCash = true;

    }

    public boolean buyByCredit = false;
    public void buyByCredit(Product product, Store store){
        if(product.getAvailable()){
            setTotalCreditPurchases(product.getPriceWhenSell());
            setTotalNumberOfTransactions(1);
            product.setTotalPurchases(product.getPriceWhenSell());
            product.setTotalNumberOfTransactions(1);
            showBuyingMessage(product.getName() , product.getPriceWhenSell());
            buyByCredit = true;
            product.setAvailable(false);

        }
    }

    public void showBuyingMessage(String product, double price){
        System.out.println("Buying : " + product + " for " + price);
    }

    public List<Product> getCustomerProducts() {
        return customerProducts;
    }
}
