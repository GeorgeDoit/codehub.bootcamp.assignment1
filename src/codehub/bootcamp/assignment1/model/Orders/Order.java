package codehub.bootcamp.assignment1.model.Orders;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Products.Product;

import java.util.Date;

public class Order {

    Customer customer;
    Product product;
    Date date;
    String deliveryStatus;

    public Order(Customer customer, Product product){
        this.customer = customer;
        this.product = product;
    }
}
