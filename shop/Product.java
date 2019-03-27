package shop;

public abstract class Product {

    private String name;
    private String brand;
    private int quantity;
    private int quantityShop;
    private int price;
    private String description;

    Product(){}

    public Product(String name, String brand, int quantity, int price, String description) {
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
        this.quantityShop = quantity;
        this.price = price;
        this.description = this.description;

    }

    public void setQuantity(int quantity){
        this.quantity =quantity;
    }

   public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return getQuantity()>0?"Is available":"No inventory";
    }

    public int getQuantityShop() {
        return quantityShop;
    }

    public void setQuantityShop(int quantityShop) {
        this.quantityShop = quantityShop;
    }
}
