package shop;

public class Classic extends Shoe{

    public Classic(int barCode,String Name, String Brand, int Quantity, int Price, String Description, String type, int shoe_size) {
        super(barCode,Name, Brand, Quantity, Price, Description, type, shoe_size);
    }
    @Override
    public String toString(){
        return String.format(
                "----------------------\n"+
                        "Product BarCode: %s\n"+
                        "Product Type: %s\n"+
                        "Product Name : %s\n"+
                        "Product Brand  : %s\n"+
                        "Product Quantity  : %s\n"+
                        "Product Price  : %s$\n"+
                        "Product Description  : %s\n"+
                        "Product Size  : %s\n",getBarCode(),getType(), getName(), getBrand(), getQuantity(), getPrice(), getDescription(),getSize());

    }


}
