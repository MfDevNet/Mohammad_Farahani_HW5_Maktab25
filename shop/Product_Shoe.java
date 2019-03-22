package shop;

public class Product_Shoe extends Product {
    private String[] sportClassic={"Sport","Classic"};
    private int shoe_Type;
    private int shoe_size;

    public Product_Shoe(String p_Id, String p_Name, String p_Brand, int p_Quantity, long p_Price, String p_Description, int shoe_Type, int shoe_size) {
        super(p_Id, p_Name, p_Brand, p_Quantity, p_Price, p_Description);
        this.shoe_Type = shoe_Type;
        this.shoe_size = shoe_size;
    }

    public String toString(){
        return String.format(
                "----------------------"+
                        "Product Type: %s\n"+
                        "Product ID : %s\n"+
                        "Product Name : %s\n"+
                        "Product Brand  : %s\n"+
                        "Product Quantity  : %s\n"+
                        "Product Price  : %s\n"+
                        "Product Description  : %s\n"+
                        "Product Size  : %s\n",sportClassic[this.shoe_Type],getP_Id(),getP_Name(),getP_Brand(),getP_Quantity(),getP_Price(),getP_Description(),this.shoe_size);

    }
}
