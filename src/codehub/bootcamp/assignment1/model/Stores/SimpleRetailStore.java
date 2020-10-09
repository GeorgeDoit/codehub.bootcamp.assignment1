package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Products.Product;

public abstract class SimpleRetailStore implements Store{
    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public void buy(Product product) {
        if (product.getAvailable()){
            totalBuyBalance = returnTotalBuyBalance(product);
            System.out.println("My totalBuyBalance is: " + totalBuyBalance);
        } else {
            System.out.println(product.getName() + " is not available");
        }
    }

    @Override
    public void sell(Product product) {
        totalSellBalance = returnTotalSellBalance(product);
        System.out.println("My totalSellBalance is: " + totalSellBalance);
    }

    @Override
    public double getRevenue() {
        return (totalSellBalance - totalBuyBalance);
    }

    public double returnTotalBuyBalance (Product product){
        return (totalBuyBalance += product.getPriceWhenBuy());
    }

    public double returnTotalSellBalance(Product product){
        return (totalSellBalance += product.getPriceWhenSell());

    }
}
