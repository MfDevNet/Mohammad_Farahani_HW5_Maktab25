package TalkALot;

public abstract class PhoneCall {

    //Declare variables.
    String phoneNumber;
    double callPrice;

    //Constructor.
    public PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        callPrice = 0.0;
    }

    public void setCallPrice(double callPrice) {
        this.callPrice = callPrice;
    }
    // abstract method
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void displayInfo();
}
