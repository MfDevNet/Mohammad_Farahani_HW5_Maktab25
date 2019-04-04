package shop;

public class Payment {

    static void payment(Customer customer) {
        customer.getCart().cartDisplay();
        System.out.println(customer.getInfoCustomer());
        System.out.println("Payment Success");
        for (Product product : customer.getCart().getProducts()) {
            if (product == null) {
                continue;
            }
            product.setQuantityShop(product.getQuantity());
            customer.getCart().removeOfCart(product, true);
        }
        System.out.println("---------------------");
        System.out.println("Cart is Empty");
        System.out.println("---------------------");

    }
}
