package codehub.bootcamp.assignment1;

import codehub.bootcamp.assignment1.model.Customer;
import codehub.bootcamp.assignment1.model.OnlineCustomer;
import codehub.bootcamp.assignment1.model.Product;
import codehub.bootcamp.assignment1.tester.Tester;

public class Main {

    public static void main(String[] args) {
	// write your code here!
//        Tester t = new Tester();
//        t.TestCode();

        Product p1 = new Product("mouse", 22.1, 23.1);
        Product p2 = new Product("mouse2", 33.1, 34.1);

        System.out.println("product with id: " + p1.getId() + " availability is " + p1.getAvailability());
        p2.setAvailability(false);
        System.out.println("product with id: " + p2.getId() + " availability is " + p2.getAvailability());
    }
}