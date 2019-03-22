package shop;

public class Product_Book extends Product {

    private String[] bookMag={"Book","Magazine"};
    private int book_Type;
    private String book_Author;

    public Product_Book(String p_Id, String p_Name, String p_Brand, int p_Quantity, long p_Price, String p_Description, int book_Type, String book_Author) {
        super(p_Id, p_Name, p_Brand, p_Quantity, p_Price, p_Description);
        this.book_Type = book_Type;
        this.book_Author = book_Author;
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
                        "Product book_Author  : %s\n",bookMag[this.book_Type],getP_Id(),getP_Name(),getP_Brand(),getP_Quantity(),getP_Price(),getP_Description(),this.book_Author);

    }

}
