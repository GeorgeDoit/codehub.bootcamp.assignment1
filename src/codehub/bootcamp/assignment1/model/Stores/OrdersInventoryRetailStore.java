package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Orders.Order;
import codehub.bootcamp.assignment1.model.Products.Product;
import codehub.bootcamp.assignment1.model.Stores.InventoryRetailStore;

public class OrdersInventoryRetailStore extends InventoryRetailStore {

    public Order createOrder(Customer customer, Product product){
        return new Order(customer, product);
    }

    public void executeOrder(){

    }
}
