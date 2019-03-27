package shop;

public abstract class Book extends Product {

    private int type;
    private String author;

    public Book(int barCode,String Name, String Brand, int Quantity, int Price, String Description, int type, String author) {
        super(barCode,Name, Brand, Quantity, Price, Description);
        this.type = type;
        this.author = author;
    }

    public int getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }
}
