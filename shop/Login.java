package shop;

import java.util.Scanner;

public class Login {
    public Customer login(Customer[] customers) {
        Scanner scanner = new Scanner(System.in);

        // login check
        while (true) {

            System.out.println("===============");
            System.out.println("Please login ");
            System.out.print("Enter username : ");
            String uname = scanner.nextLine();
            System.out.print("Enter Password : ");
            String pass = scanner.nextLine();
            for (Customer customer:customers){
                if (uname.equals(customer.getUserName()) && pass.equals(customer.getPassword())){
                    return customer;

                }
            }

        }
    }

    public Customer addCustomer(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Register Form ");
        System.out.println("Enter Information");
        System.out.println("===============");
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter mobile : ");
        String mobile = scanner.nextLine();
        System.out.print("Enter email : ");
        String email = scanner.nextLine();
        System.out.print("Enter city : ");
        String city = scanner.nextLine();
        System.out.print("Enter state : ");
        String state = scanner.nextLine();
        System.out.print("Enter street : ");
        String street = scanner.nextLine();
        System.out.print("Enter zipCode : ");
        String zipCode = scanner.nextLine();
        System.out.println("===============");
        System.out.print("Enter userName : ");
        String userName = scanner.nextLine();
        System.out.print("Enter password : ");
        String password = scanner.nextLine();

        Customer customer = new Customer(firstName, lastName, mobile, email, city, state, street, zipCode, userName, password);
        return customer;
    }


}
