package shop;

public class Digital extends Product {
    private String[] tvRadio={"Tv","Radio"};
    private int product_Type;
    private boolean Portable;

    public Digital(String p_Name, String p_Brand, int p_Quantity, int p_Price, String p_Description, int product_Type, boolean portable) {
        super(p_Name, p_Brand, p_Quantity, p_Price, p_Description);
        this.product_Type = product_Type;
        Portable = portable;

    }

    private String getPortable(boolean portable){
        return portable?"Hast":"Nist";
    }

    public String toString(){
        return String.format(
                "----------------------\n"+
                        "Product Type: %s\n"+
                        "Product Name : %s\n"+
                        "Product Brand  : %s\n"+
                        "Product Quantity  : %s\n"+
                        "Product Price  : %s$\n"+
                        "Product Description  : %s\n"+
                        "Product Portable  : %s\n",tvRadio[this.product_Type], getName(), getBrand(), getQuantity(), getPrice(), getDescription(),getPortable(this.Portable));

    }

}
