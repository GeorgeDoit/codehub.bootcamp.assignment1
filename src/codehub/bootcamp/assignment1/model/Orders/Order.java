package codehub.bootcamp.assignment1.model.Orders;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Products.Product;

import java.util.Date;

public class Order {

    Customer customer;
    Product product;
    String date;
    String deliveryStatus;
    //first-come first-served basis ? should i use a queue?

    public Order(Customer customer, Product product){
        this.customer = customer;
        this.product = product;
    }

}
