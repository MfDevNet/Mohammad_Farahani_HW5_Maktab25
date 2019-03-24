package shop;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer ;
       // login user
        customer = Login.login();
        InitialShop product = new InitialShop();
//
//        declare menu
        boolean exit = true;
        System.out.println("Welcome to Shop");
        int menu = 0;
        while (exit == true) {
            System.out.println("-----------menu----------");
            System.out.printf("Mr/Ms %s\n", customer.customerInfo());
            System.out.println("1)Show shop Product");
            System.out.println("2)show Cart Customer");
            System.out.println("3)Add to cart");
            System.out.println("4)Remove of cart");
            System.out.println("5)the payment");

            System.out.println("9)Exit");
            System.out.print("Select Item : ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1: {
                    for (Product productShow : product.getProducts()) {
                        System.out.println(productShow);
                    }
                    break;
                }
                case 2: {
                    customer.getCart().cartDisplay();
                    break;
                }
                case 3: {
                    System.out.print("Enter Product Name");
                    scanner.nextLine();
                    String select = scanner.nextLine();
                    for (Product productSelect : product.getProducts()) {
                        if (productSelect.getP_Name().equals(select)) {
                            customer.getCart().addToCart(productSelect);
                            break;
                        }

                    }
                    break;
                }
                case 4: {
                    customer.getCart().cartDisplay();
                    System.out.print("Enter Product Name");
                    scanner.nextLine();
                    String select = scanner.nextLine();
                    for (Product productSelect : customer.getCart().getProducts()) {
                        if (productSelect.getP_Name().equals(select)) {
                            customer.getCart().removeOfCart(productSelect, false);
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    payment(customer);
                    break;
                }
                case 9: {
                    return;
                }
            }

        }

    }

    static void payment(Customer customer) {
        customer.getCart().cartDisplay();
        System.out.println(customer.getInfoCustomer());
        System.out.println("Payment Success");
        for (Product product : customer.getCart().getProducts()) {
            if (product == null) {
                continue;
            }
            product.setP_QuantityShop(product.getP_Quantity());
            customer.getCart().removeOfCart(product, true);
        }
        System.out.println("---------------------");
        System.out.println("Cart is Empty");
        System.out.println("---------------------");

    }

}
