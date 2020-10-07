package codehub.bootcamp.assignment1.tester;

import codehub.bootcamp.assignment1.model.Customer;

public class Tester {

    public void TestCode(){
        String s1 = "Buying in cash";
        String s2 = "Buying by credit card";

        Customer c1 = new Customer("George");
        Customer c2 = new Customer("John",1.1,1.2,2);

        assert(c1.getTotalCashPurchases() == 0.0);
        assert(c2.getTotalCashPurchases() == 1.1);

        assert(c2.buyInCash().equals(s1));
        assert(c1.buyByCredit().equals(s2));

        c2.buyInCash();

    }

}
