package shop;

public class Readable  extends Book{


    public Readable(int barCode,String Name, String Brand, int Quantity, int Price, String Description, int type, String author) {
        super(barCode,Name, Brand, Quantity, Price, Description, type, author);
    }
    @Override
    public String toString(){
        return String.format(
                "----------------------\n"+
                        "Product BarCode: %s\n"+
                        "Product Name : %s\n"+
                        "Product Brand  : %s\n"+
                        "Product Quantity  : %s\n"+
                        "Product Price  : %s$\n"+
                        "Product Description  : %s\n"+
                        "Product book_Author  : %s\n",getBarCode(), getName(), getBrand(), getQuantity(), getPrice(), getDescription(),getAuthor());

    }
}
