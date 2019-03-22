package shop;

public abstract class Product {

    private String p_Name;
    private String p_Brand;
    private int p_Quantity;
    private long p_Price;
    private String p_Description;

    Product(){}

    public Product(String p_Name, String p_Brand, int p_Quantity, long p_Price, String p_Description) {
        this.p_Name = p_Name;
        this.p_Brand = p_Brand;
        this.p_Quantity = p_Quantity;
        this.p_Price = p_Price;
        this.p_Description = p_Description;
    }


   public String getP_Name() {
        return p_Name;
    }

    public String getP_Brand() {
        return p_Brand;
    }

    public int getP_Quantity() {
        return p_Quantity;
    }

    public long getP_Price() {
        return p_Price;
    }

    public String getP_Description() {
        return p_Description;
    }
}
