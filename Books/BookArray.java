package Books;

public class BookArray {
    public static void main(String[] args) {
//create  array
        Book books[] = new Book[10];

//create Fiction
        books[0] = new Fiction("Fiction 1");
        books[1] = new Fiction("Fiction 2");
        books[2] = new Fiction("Fiction 3");
        books[3] = new Fiction("Fiction 4");
        books[4] = new Fiction("Fiction 5");

//create NonFiction
        books[5] = new NonFiction("NonFiction 1");
        books[6] = new NonFiction("NonFiction 2");
        books[7] = new NonFiction("NonFiction 3");
        books[8] = new NonFiction("NonFiction 4");
        books[9] = new NonFiction("NonFiction 5");

//display  details
        System.out.println("Details books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println();
            System.out.println((i + 1) + ".Name:" +
                    books[i].getTitle());
            System.out.printf("Price:%s $", books[i].getPrice());
        }//end for
    }//end of main method
}//end of BookArray class

