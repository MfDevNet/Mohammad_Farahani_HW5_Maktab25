package shop;

import java.util.Random;

public class InitialShop {

    private Product[] products;

    {
        String[] brand_Digital = {"Lg", "SamSung", "Tcl", "Snowa"};
        String[] brand_Book = {"Sabz", "Simorgh", "Almas", "Naghos"};
        String[] book_Author = {"Hashemi", "Asgari", "Ghomi", "Farahani", "Nori"};
        String[] brand_Shoe = {"Tabriz", "Meli", "Bela", "Vian"};

        Random rnd = new Random();

        Product[] products = new Product[10];

        for (int i = 0; i <= products.length; i++) {
            if (i <= (products.length * 30 / 100)) {
                products[i] = new Product_Digital("Digital" + i, brand_Digital[rnd.nextInt(3)], rnd.nextInt(5) + 1, rnd.nextInt(1000) + 10000, "", rnd.nextInt(2), rnd.nextBoolean());
            } else if (i > (products.length * 30 / 100) && i < (products.length * 60 / 100)) {
                products[i] = new Product_Book("Book" + i, brand_Book[rnd.nextInt(4)], rnd.nextInt(5) + 1, rnd.nextInt(200) + 100, "", rnd.nextInt(2), book_Author[rnd.nextInt(5)]);
            } else if (i >= ((products.length) * 60 / 100)) {
                products[i - 1] = new Product_Shoe("Shoe" + i, brand_Shoe[rnd.nextInt(4)], rnd.nextInt(5) + 1, rnd.nextInt(500) + 1000, "", rnd.nextInt(2), rnd.nextInt(10) + 38);


            }
        }
        this.products = products;
    }

    public Product[] getProducts() {

        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


}
