package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Customers.Customer;
import codehub.bootcamp.assignment1.model.Customers.OnlineCustomer;
import codehub.bootcamp.assignment1.model.Orders.Order2;
import codehub.bootcamp.assignment1.model.Products.Product;

import java.util.List;
import java.util.stream.Collectors;

public class OrdersInventoryRetailStore extends InventoryRetailStore {

    public boolean paymentType;
    public Order2 Order2Test(Customer customer, Product product){

        customer.getCustomerProducts().add(product);
        return new Order2(customer, customer.getCustomerProducts());
    }

    public void executeOrder(){

    }

    public Product getCustomerProducts(Customer customer){
        if(!(getCustomersListOfProducts(customer) == null)){
            for(Product product : getCustomersListOfProducts(customer)){
                System.out.println(customer.getName() + " " + product.getPriceWhenSell());
                customer.setTotalNumberOfTransactions(1);
                customer.setTotalCostOfPurchases(product.getPriceWhenSell());

                product.setTotalNumberOfTransactions(1);
                product.setTotalPurchases(product.getPriceWhenSell());
               return product;
            }
            System.out.println(customer.getName() + " total number of trancations =" + customer.getTotalNumberOfTransactions()
                                +" cost of pychases " + customer.getTotalCostOfPurchases());
        }else {
            System.out.println("No products");
        }
        return null;
    }

    public List<Product> getCustomersListOfProducts(Customer customer){

        for(List<Product> customerProducts : mapToList(customer)){

            return customerProducts;
        }

        return null;
    }

    public List<List<Product>> mapToList(Customer customer){


        List<List<Product>> productResult = Order2.getMultiMap1().entrySet()
        .stream()
        .filter(e -> e.getKey().equals(customer))
        .map(x -> x.getValue())
        .collect(Collectors.toList());


        return productResult;

    }

}
