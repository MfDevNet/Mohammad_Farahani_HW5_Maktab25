package Books;

public class Fiction extends Book {

    //constructor called setprice method
    public Fiction(String title) {
        super(title);
        setPrice();
    }
    // implement setprice
    public void setPrice() {
        super.price = 24.99;

    }


}
