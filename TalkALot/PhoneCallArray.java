package TalkALot;

public class PhoneCallArray
{
    public static void main(String[] args)
    {

        //Create an array of incoming calls type
        PhoneCall[] incomingPhoneCalls
                =new IncomingPhoneCall[8];

        incomingPhoneCalls[0]= new IncomingPhoneCall("0912-111-1111",2);
        incomingPhoneCalls[1]= new IncomingPhoneCall("0912-111-1112",5);
        incomingPhoneCalls[2]= new IncomingPhoneCall("0912-111-1113",4);
        incomingPhoneCalls[3]= new IncomingPhoneCall("0912-111-1114",8);
        incomingPhoneCalls[4]= new IncomingPhoneCall("0912-111-1115",3);
        incomingPhoneCalls[5]= new IncomingPhoneCall("0912-111-1116",7);
        incomingPhoneCalls[6]= new IncomingPhoneCall("0912-111-1117",25);
        incomingPhoneCalls[7]= new IncomingPhoneCall("0912-111-1118",10);


        System.out.println("Incoming Calls Information");
        //print incoming calls
        for (PhoneCall phoneCall : incomingPhoneCalls) {
            phoneCall.displayInfo();
        }

        //Create an array of outgoing calls type
        PhoneCall[] outgoingPhoneCalls
                =new OutgoingPhoneCall[8];

        //set outgoing calls with phone number and number of minutes
        outgoingPhoneCalls[0]= new OutgoingPhoneCall("0919-111-1111",5);
        outgoingPhoneCalls[1]= new OutgoingPhoneCall("0919-111-1112",7);
        outgoingPhoneCalls[2]= new OutgoingPhoneCall("0919-111-1113",4);
        outgoingPhoneCalls[3]= new OutgoingPhoneCall("0919-111-1114",5);
        outgoingPhoneCalls[4]= new OutgoingPhoneCall("0919-111-1115",6);
        outgoingPhoneCalls[5]= new OutgoingPhoneCall("0919-111-1116",9);
        outgoingPhoneCalls[6]= new OutgoingPhoneCall("0919-111-1117",11);
        outgoingPhoneCalls[7]= new OutgoingPhoneCall("0919-111-1118",15);


        System.out.println("\n\nOutgoing Calls Information");

        //print outgoing calls
        for (PhoneCall phoneCall : outgoingPhoneCalls)
        {
            phoneCall.displayInfo();
        }
    }
}//End of PhoneCallArray class