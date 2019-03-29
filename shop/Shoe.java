package shop;

public abstract class Shoe extends Product {

    private String type;
    private int size;

    public Shoe(int barCode,String Name, String Brand, int Quantity, int Price, String Description, String type, int size) {
        super(barCode,Name, Brand, Quantity, Price, Description);
        this.type = type;
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public String getType() {
        return type;
    }
}
