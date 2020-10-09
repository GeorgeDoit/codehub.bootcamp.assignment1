package codehub.bootcamp.assignment1.model.Stores;

import codehub.bootcamp.assignment1.model.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements Store {

    private double totalBuyBalance;
    private double totalSellBalance;
    private List<Product> productList = new ArrayList<Product>();

    public void buy(Product product){
        if (checkForProductToBuy(product)){
            addItemToList(product);
            showBuyMessagesToUser(product, returnTotalBuyBalance(product));
        } else {
            productNotAvailableMessage(product);
        }
    }

    public void sell(Product product){
        if (checkIfProductInList(product)){
            showSellMessagesToUser(product, returnTotalSellBalance(product, product.getPriceWhenSell()), product.getPriceWhenSell());
            removeProductFromList(product);
        } else {
            productNotInInventoryMessage(product);
        }
    }

    public double getRevenue(){
        return (totalSellBalance - totalBuyBalance);
    }

    public List<Product> getInventory(){
        return productList;
    }

    public void clearOutInventory(){
        clearingInventory();
        clearingProductList();
    }

    public void showInventory(){

        for(Product product: getInventory()){
            System.out.println("Inventory has: " + product.getName());
        }
        if(productList.isEmpty()){
            System.out.println("Inventory is empty");
        }
    }

    private boolean checkForProductToBuy(Product product){
        return (product.getAvailable() && !productList.contains(product));
    }

    private double returnTotalBuyBalance(Product product){
        return (totalBuyBalance += product.getPriceWhenBuy());
    }

    private List<Product> addItemToList(Product product){
        productList.add(product);
        return productList;
    }

    private void showBuyMessagesToUser(Product product, double totalBuyBalance){
        System.out.println("Buying... "+ product.getName());
        System.out.println("My totalBuyBalance is: " + totalBuyBalance);
    }

    private void productNotAvailableMessage(Product product){
        System.out.println(product.getName() + " is not available");
    }

    private boolean checkIfProductInList(Product product){
        return productList.contains(product);
    }
    private double returnTotalSellBalance(Product product, double priceWhenSell){
        return (totalSellBalance += priceWhenSell);

    }

    private void showSellMessagesToUser(Product product, double totalSellBalance, double productSellPrice){
        System.out.println("Selling... " + product.getName() + " for " + productSellPrice);
        System.out.println("My totalSellBalance is: " + totalSellBalance);
    }

    private List<Product> removeProductFromList(Product product){
        productList.remove(product);
        return productList;
    }

    private void productNotInInventoryMessage(Product product){
        System.out.println(product.getName() + ": not in inventory");
    }

    private void clearingInventory(){
        for (Product product : productList){
            double salePrice = calculateSalePrice(product);
            returnTotalSellBalance(product, salePrice);
            showSellMessagesToUser(product, totalSellBalance, salePrice);
        }
    }

    private void clearingProductList(){
        productList.clear();
    }

    private double calculateSalePrice(Product product){
        return (product.getPriceWhenSell() - (10 * product.getPriceWhenSell()/100.0));
    }

}
