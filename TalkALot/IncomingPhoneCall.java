package TalkALot;

//IncomingPhoneCall
public class IncomingPhoneCall extends PhoneCall {

    int callTime;
    // constructor with 2 parameter
    public IncomingPhoneCall(String phoneNum, int time) {

        super(phoneNum);
        callTime = time;
        callPrice = 0.02;
    }

    // method get phone number override
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // method get price override
    @Override
    public double getPrice() {
        return callPrice;

    }

    public int getCallTime() {
        return callTime;
    }
    // method display override
    @Override
    public void displayInfo() {
        System.out.println("\n---------------------------------");
        System.out.printf("Phone number: " + getPhoneNumber() +
                "\nType Call : IncomingPhoneCall"+
                "\nRate: " + callPrice +
                "\nTotal duration: " + getCallTime() + " min" +
                "\nPrice of call: $" + getPrice());
    }

}//End of IncomingPhoneCall class

