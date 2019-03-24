package TalkALot;

//DemoPhoneCall.java
public class DemoPhoneCalls {
    public static void main(String[] args) {
        // create phone array
        PhoneCall[] phoneArray = new PhoneCall[10];
        // loop for create phone and time call
        for (int x = 0; x < phoneArray.length; x++) {
            if (x % 2 == 0) phoneArray[x] = new IncomingPhoneCall("0912-111-111" + x, x);
            else phoneArray[x] = new OutgoingPhoneCall("0912-111-111" + x, x * 5);
        }
        //loop for display array
        for (int a = 0; a < 10; a++) {
            phoneArray[a].displayInfo();
        }

    }
}//End of DemoPhoneCall
