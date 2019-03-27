package shop;

public class Address {
    private String city;
    private String state;
    private String street;
    private String address;
    private String zipCode;

    public Address() {
    }

    public Address(String city, String state, String street, String  zipCode){
        this.city = city;
        this.state = state;
        this.street = street;
        this.address = city + ". " + state + ". " + street;
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }
}
