package codehub.bootcamp.assignment1.model;

public class Customer {
    private String name;
    private double totalCashPurchases;
    private double totalCreditPurchases;
    private int totalNumberOfTransactions;

    public Customer(String name) {
        this(name, 0.0, 0.0, 0);
        this.name = name;
        this.totalCashPurchases = 0.0;
        this.totalCreditPurchases = 0.0;
        this.totalNumberOfTransactions = 0;
    }

    public double getTotalCashPurchases() {
        return totalCashPurchases;
    }

    public Customer(String name, double totalCashPurchases, double totalCreditPurchases, int totalNumberOfTransactions){
        this.name = name;
        this.totalCashPurchases = totalCashPurchases;
        this.totalCreditPurchases = totalCreditPurchases;
        this.totalNumberOfTransactions = totalNumberOfTransactions;
    }

    public String buyInCash(){
       return "Buying in cash";
    }

    public String buyByCredit(){
        return "Buying by credit card";
    }

}
