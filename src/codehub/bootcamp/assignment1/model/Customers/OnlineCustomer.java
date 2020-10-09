package codehub.bootcamp.assignment1.model.Customers;

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

    public void buyByCredit(){
        if (checkIfGovCustomer()){
            govBuyInCreditMessage();
            buyByCredit = false;
        } else {
            buyByCredit = true;
        }
    }
    public void checkForBonusDiscount(){
        int creditCardDiscount = 5;

        if (checkTransactionPaymentType().equals("Credit") && !checkIfGovCustomer()){
            setBonusDiscount(creditCardDiscount + getCustomerCategory().discountPercentage);
        } else {
            setBonusDiscount(getCustomerCategory().discountPercentage);
        }
    }

    private int bonus;
    private void setBonusDiscount(int discount){
        this.bonus = discount;
    }

    public int getBonusDiscount(){
        return this.bonus;
    }

    private boolean checkIfGovCustomer(){
        return (getCustomerCategory() == CustomerCategory.GOVERNMENT );
    }

    private void govBuyInCreditMessage(){
        System.out.println("Government customers can only use Cash");

    }
}
