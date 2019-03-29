package shop;

public class Radio extends Digital {

    private boolean portable;

    public Radio(int barCode,String Name, String Brand, int Quantity, int Price, String Description, boolean portable) {
        super(barCode,Name, Brand, Quantity, Price, Description);
        this.portable=portable;
    }
    private String getPortable(boolean portable){
        return portable?"Hast":"Nist";
    }

    @Override
    public  String toString(){
        return String.format(
                "----------------------\n"+
                        "Product BarCode : %s\n"+
                        "Product Name : %s\n"+
                        "Product Brand  : %s\n"+
                        "Product Quantity  : %s\n"+
                        "Product Price  : %s$\n"+
                        "Product Description  : %s\n"+
                        "Product Portable  : %s\n",getBarCode(),getName(),getBrand(),getQuantity(),getPrice(),getDescription(),getPortable(this.portable));

    }
}
