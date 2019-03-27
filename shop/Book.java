package shop;

public class Book extends Product {

    private String[] bookMag={"Book","Magazine"};
    private int book_Type;
    private String book_Author;

    public Book(String p_Name, String p_Brand, int p_Quantity, int p_Price, String p_Description, int book_Type, String book_Author) {
        super(p_Name, p_Brand, p_Quantity, p_Price, p_Description);
        this.book_Type = book_Type;
        this.book_Author = book_Author;
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
                        "Product book_Author  : %s\n",bookMag[this.book_Type],getP_Name(),getP_Brand(),getP_Quantity(),getP_Price(),getP_Description(),this.book_Author);

    }

}
