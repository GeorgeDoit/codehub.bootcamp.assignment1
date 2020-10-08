package codehub.bootcamp.assignment1.model;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements Store {

    private double totalBuyBalance;
    private double totalSellBalance;
    List<Product> productList = new ArrayList<Product>();

    public void buy(Product product){

        if (product.getAvailable() && !productList.contains(product)){
            totalBuyBalance += product.getPriceWhenBuy();
            productList.add(product);
            System.out.println("buying "+ product.getName());
            System.out.println("My totalBuyBalance is: " + totalBuyBalance);

        } else {
            System.out.println(product.getName() + " is not available");
        }
    }

    public void sell(Product product){
        if (productList.contains(product)){
            System.out.println("Selling " + product.getName());
            totalSellBalance += product.getPriceWhenSell();
            System.out.println("My totalSellBalance is: " + totalSellBalance);
            productList.remove(product);
        } else {
            System.out.println("Product not in inventory");
        }
    }

    public double getRevenue(){
        return (totalSellBalance - totalBuyBalance);
    }

    public List<Product> getInventory(){
        return productList;
    }

    public void clearOutInventory(){
        for (Product product : productList){
            double salePrice = (product.getPriceWhenSell() - (10 * product.getPriceWhenSell()/100.0));
            totalSellBalance += salePrice;
            System.out.println("Selling " + product.getName() + " for " + salePrice);
        }
        productList.clear();
    }

    public void showInventory(){

        for(Product product: getInventory()){
            System.out.println("Inventory has: " + product.getName());
        }
        if(productList.isEmpty()){
            System.out.println("Inventory is empty");
        }
    }

}
