package liskovForClass;

public class Stock {
    private final int quantity;
    private final float price;
    private final String name;


    public Stock(int quantity, float price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


}
