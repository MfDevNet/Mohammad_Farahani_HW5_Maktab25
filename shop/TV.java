package shop;

public class TV extends Digital {

    private String size;
    private boolean portable;

    public TV(int barCode,String Name, String Brand, int Quantity, int Price, String Description, String size, boolean portable) {
        super(barCode,Name, Brand, Quantity, Price, Description);
        this.size = size;
        this.portable = portable;
    }

    private String getPortable(boolean portable) {
        return portable ? "Hast" : "Nist";
    }

    @Override
    public String toString() {
        return String.format(
                "----------------------\n" +
                        "Product BarCode : %s\n" +
                        "Product Name : %s\n" +
                        "Product Brand  : %s\n" +
                        "Product Size  : %s\n" +
                        "Product Quantity  : %s\n" +
                        "Product Price  : %s$\n" +
                        "Product Description  : %s\n" +
                        "Product Portable  : %s\n",getBarCode(),getName(), getBrand(), this.size, getQuantity(), getPrice(), getDescription(), getPortable(this.portable));

    }
}
