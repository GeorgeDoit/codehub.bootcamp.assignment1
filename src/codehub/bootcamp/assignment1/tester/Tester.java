package codehub.bootcamp.assignment1.tester;

import codehub.bootcamp.assignment1.model.Customer;
import codehub.bootcamp.assignment1.model.OnlineCustomer;

public class Tester {

    public void TestCode(){

        Customer c1 = new Customer("George");
        Customer c2 = new Customer("John",1.1,1.2,2);

        assert(c1.getTotalCashPurchases() == 0.0);
        System.out.println("Customer's Constructor with name parameter working");
        assert(c2.getTotalCashPurchases() == 1.1);
        System.out.println("Customer's Constructor with all the parameters working");

        c1.buyByCredit();

        assert (c1.buyByCredit);
        System.out.println("Customer's by by credit working");

        c2.buyInCash();

        assert (c2.buyInCash);
        System.out.println("Customer's by in cash working");
        System.out.println("Customer Class is working fine");
        System.out.println("------------------------------");


        OnlineCustomer o1 = new OnlineCustomer("Greece", "Gov");
        OnlineCustomer o2 = new OnlineCustomer("George", 44.1, 1000.1, 2, "Doitsinis", OnlineCustomer.CustomerCategory.BUSINESS);

        assert(o1.getTotalCashPurchases() == 0.0);
        System.out.println("OnlineCustomer's Constructor with default parameters working");

        assert (o2.getTotalCreditPurchases() == 1000.1);
        System.out.println("OnlineCustomer's Constructor with custom parameters working");

        o1.setCustomerCategory(OnlineCustomer.CustomerCategory.GOVERNMENT);
        assert (o1.getCustomerCategory() == OnlineCustomer.CustomerCategory.GOVERNMENT);
        System.out.println("OnlineCustomer's CustomerCategory setter and getter working");

        o2.buyByCredit();

        assert (o2.buyByCredit);
        System.out.println("OnlineCustomer's buyByCredit() is working");

        o1.buyInCash();
        assert (o1.checkTransactionPaymentType().equals("Cash"));
        assert (o2.checkTransactionPaymentType().equals("Credit"));
        System.out.println("OnlineCustomer's checkTransactionPaymentType() is working");

        o2.checkForBonusDiscount();
        assert(o2.getBonusDiscount() == 7);
        System.out.println("OnlineCustomer's checkForBonusDiscount() is working");
    }

}
