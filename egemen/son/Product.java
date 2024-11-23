
public class Product {
    private String name = "Unknown Product";
    private float price;
    private int stockQuantity = 0;
    private int itemId;

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Product(String name, float price, int stockQuantity, int itemId) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.itemId = itemId;
    }
}
