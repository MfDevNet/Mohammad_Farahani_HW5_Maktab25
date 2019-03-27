package shop;

public class Cart {

    private Product[] products = new Product[5];
    private int cartFullFlag = 0;

    public Cart() {
    }


    public void addToCart(Product product) {
        if (cartFullFlag == 5) {
            System.out.println("---------------------");
            System.out.println("Cart is Full");
            System.out.println("---------------------");
            return;
        }
        if (product.getQuantity() == 0) {
            System.out.println("---------------------");
            System.out.println("Product No inventory");
            System.out.println("---------------------");
            return;
        } else if (product.getQuantity() != 0) {
            System.out.println("---------------------");
            System.out.println("add to cart ");
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = product;
                    System.out.println(products[i]);
                    product.setQuantity(product.getQuantity() - 1);
                    cartFullFlag++;
                    return;
                } else continue;

            }
        }
    }

    public void removeOfCart(Product product, boolean isPayment) {

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;

            }
            if (products[i].getName() == product.getName()) {
                products[i] = null;
                if (isPayment == false) product.setQuantity(product.getQuantity() + 1);
                cartFullFlag--;
                if (isPayment == false) {
                    System.out.println("---------------------");
                    System.out.println("Remove of cart : " + product.getName() + " Brand: " + product.getBrand());
                    System.out.println("---------------------");
                }
                if (isPayment == true) cartFullFlag = 0;
                return;
            }
        }

    }

    public Product[] getProducts() {
        return products;
    }


    public void cartDisplay() {
        System.out.println("------------------");
        System.out.println("------Cart--------");
        int totalPrice = 0, totalQuantity = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                System.out.println("Item Empty");
                continue;
            }

            if (products[i] instanceof Digital) {
                System.out.println("Digital Product Name:" + products[i].getName() + " Brand:" + products[i].getBrand() + " Price:" + products[i].getPrice());
                totalPrice += products[i].getPrice();
                totalQuantity++;
            }
            if (products[i] instanceof Book) {
                System.out.println("Book    Product Name:" + products[i].getName() + " Brand:" + products[i].getBrand() + " Price:" + products[i].getPrice());
                totalPrice += products[i].getPrice();
                totalQuantity++;
            }
            if (products[i] instanceof Shoe) {
                System.out.println("Shoe    Product Name:" + products[i].getName() + " Brand:" + products[i].getBrand() + " Price:" + products[i].getPrice());
                totalPrice += products[i].getPrice();
                totalQuantity++;
            }

        }
        System.out.println("------------------");
        System.out.println("Totla Price : " + totalPrice);
        System.out.println("Totla Quantity : " + totalQuantity);
        System.out.println("------------------");


    }
}


