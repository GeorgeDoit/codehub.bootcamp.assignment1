package codehub.bootcamp.assignment1.model.Customers;

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

    public Customer(String name, double totalCashPurchases, double totalCreditPurchases, int totalNumberOfTransactions){
        this.name = name;
        this.totalCashPurchases = totalCashPurchases;
        this.totalCreditPurchases = totalCreditPurchases;
        this.totalNumberOfTransactions = totalNumberOfTransactions;
    }

    public String getName() {
        return name;
    }

    public double getTotalCashPurchases() {
        return totalCashPurchases;
    }

    public double getTotalCreditPurchases() {
        return totalCreditPurchases;
    }

    public int getTotalNumberOfTransactions() {
        return totalNumberOfTransactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalCashPurchases(double totalCashPurchases) {
        this.totalCashPurchases = totalCashPurchases;
    }

    public void setTotalCreditPurchases(double totalCreditPurchases) {
        this.totalCreditPurchases = totalCreditPurchases;
    }

    public void setTotalNumberOfTransactions(int totalNumberOfTransactions) {
        this.totalNumberOfTransactions = totalNumberOfTransactions;
    }

    public boolean buyInCash = false;
    public void buyInCash() {
        buyInCash = true;
    }

    public boolean buyByCredit = false;
    public void buyByCredit(){
        buyByCredit = true;
    }

}
