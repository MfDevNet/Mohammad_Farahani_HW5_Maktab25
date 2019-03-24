package Books;

public abstract class Book {
    private String title;
    double price;
    //constructor
    public Book(String title){
        this.title=title;
        this.price=0.0;
        setPrice();

    }
    //gettitle method
    public String getTitle(){
        return this.title;

    }
//getprice method
    public double getPrice(){
        return this.price;
    }
//abstract setprice method without body
    public abstract void setPrice();



}

