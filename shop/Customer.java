package shop;

public class Customer  {

    private Cart cart = new Cart();

    private Address address;

    public Cart getCart() {
        return cart;
    }


    // variable
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String userName;
    private String password;

    public Customer(){
        this.firstName="";
                this.lastName="";
    }
    // constructor
    public Customer(String firstName, String lastName, String mobile, String email,String city, String state, String street, String  zipCode,  String userName, String password) {
        this.address=new Address(city, state, street,  zipCode);
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.userName = userName;
        this.password = password;

    }

    public String getInfoCustomer(){
        return String.format(
                "Mr/Ms %s \n"+
                        "Mobile %s \n"+
                        "Address %s  ZipCode %s",customerInfo(),this.mobile,address.getAddress(),address.getZipCode()

        );
    }
    // get user info
    public String customerInfo() {
        return this.firstName + " " + this.lastName;
    }

    // for auth user
    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }


}
