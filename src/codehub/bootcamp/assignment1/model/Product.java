package codehub.bootcamp.assignment1.model;

public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;
    private boolean availability;

    static int counter = 1;

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
        this.priceWhenBuy = priceWhenBuy;
    }

    public void setPriceWhenSell(double priceWhenSell) {
        this.priceWhenSell = priceWhenSell;
    }

    public void setAvailability(boolean x){
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

    public boolean getAvailability(){
        return availability;
    }

    public void setReserved(boolean x){
        if (x) {
            System.out.println("Product Reserved");
            setAvailability(false);
        }
    }
}
