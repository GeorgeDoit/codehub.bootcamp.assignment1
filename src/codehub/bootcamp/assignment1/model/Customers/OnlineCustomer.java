package codehub.bootcamp.assignment1.model.Customers;

import codehub.bootcamp.assignment1.model.Products.Product;
import codehub.bootcamp.assignment1.model.Stores.Store;

public class OnlineCustomer extends Customer{

    private String username;
    private CustomerCategory customerCategory;

    public enum CustomerCategory {
        INDIVIDUAL(0),
        BUSINESS(2),
        GOVERNMENT(3);

        private int discountPercentage;

        CustomerCategory(int discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        public int getDiscountPercentage(){
            return this.discountPercentage;
        }

    }

    public OnlineCustomer(String name, String username) {
        super(name);
        this.username = username;
    }

    public OnlineCustomer(String name, double totalCashPurchases, double totalCreditPurchases, int totalNumberOfTransactions, String username, CustomerCategory customerCategory) {
        super(name, totalCashPurchases, totalCreditPurchases, totalNumberOfTransactions);
        this.username = username;
        this.customerCategory = customerCategory;

    }

    public String getUsername() {
        return username;
    }

    public CustomerCategory getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(CustomerCategory customerCategory){
        this.customerCategory = customerCategory;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String checkTransactionPaymentType(){
        if (buyInCash){
            return "Cash";
        } else if(checkIfGovCustomer() && buyByCredit){
            govBuyInCreditMessage();
            return "Cash";
        } else {
            return "Credit";
        }
    }

    public void buyByCredit(Product product, Store store){
        if (checkIfGovCustomer()){
            govBuyInCreditMessage();
            buyByCredit = false;
        } else {
            checkForBonusDiscount(product);
            buyByCredit = true;
            showBuyingMessage(product.getName(), getNewSellPrice());
            product.setTotalPurchases(getNewSellPrice());
            product.setTotalNumberOfTransactions(1);
            setTotalCreditPurchases(getNewSellPrice());
            setTotalNumberOfTransactions(1);

        }
    }

    public void buyInCash(Product product, Store store){
        checkForBonusDiscount(product);
        showBuyingMessage(product.getName(), getNewSellPrice());
        product.setTotalPurchases(getNewSellPrice());
        product.setTotalNumberOfTransactions(1);
        setTotalCashPurchases(getNewSellPrice());
        setTotalNumberOfTransactions(1);
    }

    private void checkForBonusDiscount(Product product){
        int creditCardDiscount = 5;

        if (checkTransactionPaymentType().equals("Credit") && !checkIfGovCustomer()){
            setNewSellPrice(creditCardDiscount + getCustomerCategory().discountPercentage, product.getPriceWhenSell());
        } else {
            setNewSellPrice (getCustomerCategory().discountPercentage, product.getPriceWhenSell());
        }
    }

    private double newSellPrice;
    private void setNewSellPrice(int discount, double price){
        newSellPrice = price - (discount * price/100);
    }

    public double getNewSellPrice(){
        return this.newSellPrice;
    }

    private boolean checkIfGovCustomer(){
        return (getCustomerCategory() == CustomerCategory.GOVERNMENT );
    }

    private void govBuyInCreditMessage(){
        System.out.println("Government customers can only use Cash");
    }

}
