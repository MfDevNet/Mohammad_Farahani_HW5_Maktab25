package shop;

public class Customer {
    // variable
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String city;
    private String state;
    private String street;
    private String address;
    private int zipCode;

    private String userName;
    private String password;

    // constructor
    public Customer(String firstName, String lastName, String mobile, String email, String city, String state, String street, int zipCode, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.state = state;
        this.street = street;
        this.address = city + ". " + state + ". " + street;
        this.zipCode = zipCode;
        this.userName = userName;
        this.password = password;

    }
    // get user info
    public String customerInfo(){
        return this.firstName+" " +this.lastName;
    }
    // for auth user
    public String getUserName(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }


}
