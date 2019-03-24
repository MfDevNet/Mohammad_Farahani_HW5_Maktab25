package TalkALot;

public class OutgoingPhoneCall extends PhoneCall {

    int callTime;

    // constructor with 2 parameter
    public OutgoingPhoneCall(String phoneNum, int time) {

        super(phoneNum);
        callTime = time;
        callPrice = 0.04;
    }

    // method get phone number override
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
            }

    // method get price override
    @Override
    public double getPrice() {
        return callTime * callPrice;
    }

    public int getCallTime() {
        return callTime;
    }

    // method display override
    @Override
    public void displayInfo() {
        System.out.println("\n---------------------------------");
        System.out.printf("Phone number: " + getPhoneNumber() +
                "\nType Call : OutgoingPhoneCall"+
                "\nRate: " + callPrice +
                "\nTotal duration: " + getCallTime() + " min" +
                "\nPrice of call: $" + getPrice());
    }

}//End of OutgoingPhoneCall class

