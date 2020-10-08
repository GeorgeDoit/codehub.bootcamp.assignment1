package codehub.bootcamp.assignment1.model;

 public class SimpleRetailStore implements Store{
    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public void buy(Product product) {
        if (product.getAvailability()){
            totalBuyBalance += product.getPriceWhenBuy();
            System.out.println("My totalBuyBalance is: " + totalBuyBalance);
        } else {
            System.out.println(product.getName() + " is not available");
        }
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
        System.out.println("My totalSellBalance is: " + totalSellBalance);

    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }
}
