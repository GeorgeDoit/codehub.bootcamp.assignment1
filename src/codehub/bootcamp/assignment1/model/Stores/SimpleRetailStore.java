package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Products.Product;

public class SimpleRetailStore implements Store{
    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public boolean buy(Product product) {
        if (product.getAvailable()){
            totalBuyBalance = returnTotalBuyBalance(product);
            System.out.println("My totalBuyBalance is: " + totalBuyBalance);
        } else {
            System.out.println(product.getName() + " is not available");
        }
        return true;

    }

    @Override
    public boolean sell(Product product) {
        totalSellBalance = returnTotalSellBalance(product);
        System.out.println("My totalSellBalance is: " + totalSellBalance);
        return true;
    }

    @Override
    public double getRevenue() {
        return (totalSellBalance - totalBuyBalance);
    }

    @Override
    public void clearOutInventory() {

    }

    @Override
    public void showInventory() {

    }

    public double returnTotalBuyBalance (Product product){
        return (totalBuyBalance += product.getPriceWhenBuy());
    }

    public double returnTotalSellBalance(Product product){
        return (totalSellBalance += product.getPriceWhenSell());

    }
}
