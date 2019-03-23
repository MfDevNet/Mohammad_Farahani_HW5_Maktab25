package shop;

public class Cart {

    Product[] products = new Product[5];
    private int cartFullFlag = 0;

    public Cart() {
    }


    public void addToCart(Product product) {
        if (cartFullFlag == 5) {
            System.out.println("Cart is Full");
            return;
        }
        if (product.getP_Quantity() == 0) {
            System.out.println("Product No inventory");
            return;
        } else if (product.getP_Quantity() != 0) {
            System.out.println("add to cart ");
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = product;
                    System.out.println(products[i]);
                    product.setP_Quantity(product.getP_Quantity() - 1);
                    cartFullFlag++;
                    return;
                } else continue;

            }
        }
    }

    public void removeOfCart(Product product) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].getP_Name() == product.getP_Name()) {
                products[i] = null;
                product.setP_Quantity(product.getP_Quantity() + 1);
                System.out.println("Remove of cart : " + product.getP_Name() + " Brand: " + product.getP_Brand());
                return;
            }
        }

    }

    public Product[] getProducts() {
        return products;
    }

    public void cartDisplay() {
        int totalPrice=0,totalQuantity=0;
        System.out.println(products[1]);

        for (int i = 0; i < products.length; i++) {
            if (products[i]==null)continue;

            if (products[i] instanceof Product_Digital){
                System.out.println("Digital Product Name:"+products[i].getP_Name()+" Brand:"+products[i].getP_Brand()+" Price:"+products[i].getP_Price() );
                totalPrice+=products[i].getP_Price();
                totalQuantity++;
            }
            if (products[i] instanceof Product_Book){
                System.out.println("Book    Product Name:"+products[i].getP_Name()+" Brand:"+products[i].getP_Brand()+" Price:"+products[i].getP_Price() );
                totalPrice+=products[i].getP_Price();
                totalQuantity++;
            }
            if (products[i] instanceof Product_Shoe){
                System.out.println("Shoe    Product Name:"+products[i].getP_Name()+" Brand:"+products[i].getP_Brand()+" Price:"+products[i].getP_Price() );
                totalPrice+=products[i].getP_Price();
                totalQuantity++;
            }

        }
        System.out.println("------------------");
        System.out.println("Totla Price : "+totalPrice );
        System.out.println("Totla Quantity : "+totalQuantity );
        System.out.println("------------------");


    }
}


