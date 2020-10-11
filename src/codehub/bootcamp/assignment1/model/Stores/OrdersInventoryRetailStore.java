package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Orders.Order;
import codehub.bootcamp.assignment1.model.Products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrdersInventoryRetailStore extends InventoryRetailStore {

    public String paymentType;
    public Order Order2Test(Customer customer, Product product, String paymentType){

        this.paymentType = paymentType;
        customer.getCustomerProducts().add(product);
        return new Order(customer, customer.getCustomerProducts());
    }

    public void executeOrder(){

    }

    public Product getCustomerProducts(Customer customer){
        List<Product> productList = getCustomersListOfProducts(customer);
        if((productList != null)){
            for(Product product : productList){
                buyProduct(customer,product);
            }
        }else {
            System.out.println("No products");
        }
        return null;
    }

    public void buyProduct(Customer customer, Product product){
//        System.out.println(paymentType);
            if(paymentType.equals("Cash")){
                customer.buyInCash(product);
            }else {
                customer.buyByCredit(product);
            }
    }

    public List<Product> getCustomersListOfProducts(Customer customer){

        for(List<Product> customerProducts : mapToList(customer)){

            return customerProducts;
        }

        return null;
    }

    public List<List<Product>> mapToList(Customer customer){

        List<List<Product>> productResult = Order.getMultiMap1().entrySet()
        .stream()
        .filter(e -> e.getKey().equals(customer))
        .map(x -> x.getValue())
        .collect(Collectors.toList());

        return productResult;

    }

}
