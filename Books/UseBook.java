package Books;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("fiction Book");
        NonFiction nonFiction = new NonFiction("nonFiction book");

        System.out.println(fiction.getTitle() + " price $" + fiction.getPrice());
        System.out.println(nonFiction.getTitle() + " price $" + nonFiction.getPrice());
        }
    }





