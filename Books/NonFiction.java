package Books;

public class NonFiction extends Book {
    //constructor called setprice method
    public NonFiction(String title) {
        super(title);
        setPrice();
    }
    // implement setprice
    public void setPrice() {
        super.price = 37.99;

    }


}
