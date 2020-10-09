package codehub.bootcamp.assignment1.model.Products;

public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;
    private boolean availability;

    static int counter = 1;

    public Product(String name){
        this.id = counter ++;
        this.name = name;
        this.availability = true;

    }

    public Product(String name, double priceWhenBuy, double priceWhenSell) {
        this.id = counter ++;
        this.name = name;
        this.priceWhenBuy = priceWhenBuy;
        this.priceWhenSell = priceWhenSell;
        this.availability = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceWhenBuy(double priceWhenBuy) {
        if (this.priceWhenBuy == 0){
            this.priceWhenBuy = priceWhenBuy;
        } else {
            System.out.println("This product already have a Buy price");
        }
    }

    public void setPriceWhenSell(double priceWhenSell) {
        if (this.priceWhenSell == 0){
            this.priceWhenSell = priceWhenSell;
        } else {
            System.out.println("This product already have a Sell price");
        }
    }

    public void setAvailable(boolean x){
        this.availability = x;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public double getPriceWhenSell() {
        return priceWhenSell;
    }

    public boolean getAvailable(){
        return availability;
    }

    public void setReserved(boolean x){
        if (x) {
            System.out.println("Product Reserved");
            setAvailable(false);
        }
    }
}
