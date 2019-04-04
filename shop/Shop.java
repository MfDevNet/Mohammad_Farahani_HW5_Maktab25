package shop;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer[] customers = new Customer[10];
        Customer customer = null;
        Login login = new Login();

        // initial Shop
        InitialShop product = new InitialShop();


        // declare menu
        boolean exit = true;
        System.out.println("Welcome to Shop");
        int menu = 0;

        while (exit == true) {
            System.out.println();
            System.out.println("-----------menu----------");
            System.out.printf("Mr/Ms %s\n", customer == null ? "Guest" : customer.customerInfo());
            System.out.println("1)Show shop Product");
            System.out.println("2)show Cart Customer");
            System.out.println("3)Add to cart");
            System.out.println("4)Remove of cart");
            System.out.println("5)the payment");
            System.out.println("6)Register Customer");
            System.out.println("7)Login/Change Customer");


            System.out.println("9)Exit");
            System.out.print("Select Item : ");
            menu = scanner.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {
                    if (customer != null)
                        for (Product productShow : product.getProducts()) {
                            System.out.println(productShow);
                        }
                    else {
                        System.out.println("Please Register/Login Customer");
                    }
                    break;
                }
                case 2: {
                    if (customer == null) break;
                    customer.getCart().cartDisplay();
                    break;
                }
                case 3: {
                    if (customer == null) break;
                    System.out.print("Enter BarCode");
                    int select = scanner.nextInt();
                    for (Product productSelect : product.getProducts()) {
                        if (productSelect.getBarCode()==(select)) {
                            customer.getCart().addToCart(productSelect);
                            break;
                        }

                    }
                    break;
                }
                case 4: {
                    if (customer == null) break;
                    customer.getCart().cartDisplay();
                    System.out.print("Enter BarCode");
                    int select = scanner.nextInt();
                    for (Product productSelect : customer.getCart().getProducts()) {
                        if (productSelect.getBarCode()==select) {
                            customer.getCart().removeOfCart(productSelect, false);
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    if (customer == null) break;
                    Payment.payment(customer);
                    break;
                }

                case 6: {
                    Customer addCustomer = login.addCustomer();
                    for (int i = 0; i < customers.length; i++) {
                        if (customers[i] != null)continue;
                            customers[i] = addCustomer;
                            break;
                    }
                    break;
                }
                case 7: {
                    // login user
                    customer = login.login(customers);
                    break;
                }

                case 8: {
                    System.out.println(customer.getInfoCustomer());
                    break;
                }
                case 9: {
                    return;
                }
                default:{
                    break;
                }
            }

        }

    }



}
