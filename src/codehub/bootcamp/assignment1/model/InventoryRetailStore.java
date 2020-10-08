package codehub.bootcamp.assignment1.model;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements Store {

    private double totalBuyBalance;
    private double totalSellBalance;
    List<Product> productList = new ArrayList<Product>();

    public void buy(Product product){

        if (product.getAvailability()){
            totalBuyBalance += product.getPriceWhenBuy();
            productList.add(product);
            System.out.println("My totalBuyBalance is: " + totalBuyBalance);

        } else {
            System.out.println(product.getName() + " is not available");
        }
    }

    public void sell(Product product){
        if (productList.contains(product)){
            totalSellBalance += product.getPriceWhenSell();
            System.out.println("My totalSellBalance is: " + totalSellBalance);
            productList.remove(product);
        } else {
            System.out.println("Product not in inventory");
        }
    }

    public double getRevenue(){
        return totalSellBalance - totalBuyBalance;
    }

    public List<Product> getInventory(){
        return productList;
    }

    public void clearInventory(){
        productList.clear();
    }

    public void showInventory(){
        for(Product product: getInventory()){
            System.out.println(product);
        }
    }

}
