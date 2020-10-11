package codehub.bootcamp.assignment1.model.Orders;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Products.Product;

import java.text.SimpleDateFormat;
import java.util.*;

public class Order2 {

    Customer customer;
    Product product;
    Date date;
    String deliveryStatus;

    public static Map<Customer,List<Product>> multiMap = new HashMap<>();

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public Order2(Customer customer,List<Product> productList){

        this.customer = customer;
        this.date = new Date();
        this.deliveryStatus = "Pending";
        multiMap.put(customer,productList);

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDate() {
        return formatter.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }


    public static Map<Customer, List<Product>> getMultiMap1(){
        return multiMap;
    }

}
