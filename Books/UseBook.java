package Books;

public class UseBook {
    public static void main(String[] args) {
        // create book Array
        Book Books[] = new Book[10];
        // init book Array with book
        for (int i = 0; i < Books.length; i++) {
            if (i % 2 == 0) {
                Books[i] = new Fiction("Fiction Book" + i);
            } else {
                Books[i] = new NonFiction("NonFiction Book" + i);
            }
        }
        //display book Array
        for (Book book : Books) {
            System.out.println("Book: " + book.getTitle() + " Price $" + book.getPrice());
        }
    }
}




