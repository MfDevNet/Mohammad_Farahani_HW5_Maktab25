package shop;

import java.util.Random;

public class InitialShop {

    private Product[] products;

    {
        String[] brand_Digital = {"Lg", "SamSung", "Tcl", "Snowa"};
        String[] tvSize = {"27", "32", "42", "48", "50", "55"};
        String[] brand_Book = {"Sabz", "Simorgh", "Almas", "Naghos"};
        String[] book_Author = {"Hashemi", "Asgari", "Ghomi", "Farahani", "Nori"};
        String[] brand_Shoe = {"Tabriz", "Meli", "Bela", "Vian"};

        Random rnd = new Random();

        Product[] products = new Product[20];

        for (int i = 0; i <= products.length; i++) {
            // for select classic or sport - tv or radio  - mag  or readable
            int setType = rnd.nextInt(2);
            if (i <= (products.length * 30 / 100)) {
                if (setType == 0) {
                    products[i] = new TV(i+1000,"TV", brand_Digital[rnd.nextInt(3)], rnd.nextInt(5) + 1, rnd.nextInt(1000) + 10000, "", tvSize[rnd.nextInt(6)], rnd.nextBoolean());
                } else {
                    products[i] = new Radio(i+1000,"Radio", brand_Digital[rnd.nextInt(3)], rnd.nextInt(5) + 1, rnd.nextInt(1000) + 10000, "", rnd.nextBoolean());
                }
            } else if (i > (products.length * 30 / 100) && i < (products.length * 60 / 100)) {
                if (setType == 0) {
                    products[i] = new Magazine(i+1000,"Magazine", brand_Book[rnd.nextInt(4)], rnd.nextInt(5) + 1, rnd.nextInt(200) + 100, "", rnd.nextInt(2), book_Author[rnd.nextInt(5)]);
                } else {
                    products[i] = new Readable(i+1000,"Readable", brand_Book[rnd.nextInt(4)], rnd.nextInt(5) + 1, rnd.nextInt(200) + 100, "", rnd.nextInt(2), book_Author[rnd.nextInt(5)]);
                }

            } else if (i >= ((products.length) * 60 / 100)) {
                if (setType == 0) {
                    products[i - 1] = new Sport(i+1000,"Sport shoes" , brand_Shoe[rnd.nextInt(4)], rnd.nextInt(5) + 1, rnd.nextInt(500) + 1000, "", "Sport", rnd.nextInt(10) + 38);
                } else {
                    products[i - 1] = new Classic(i+1000,"Classic shoes" , brand_Shoe[rnd.nextInt(4)], rnd.nextInt(5) + 1, rnd.nextInt(500) + 1000, "", "Classic", rnd.nextInt(10) + 38);
                }

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
