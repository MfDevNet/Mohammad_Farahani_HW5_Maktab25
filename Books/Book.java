package Books;

public abstract class Book {
    private String title;
    double price;

    public Book(String title){
        this.title=title;
        this.price=0.0;


    }

    public String getTitle(){
        return this.title;

    }

    public double getPrice(){
        return this.price;
    }

    public abstract void setPrice();


}

