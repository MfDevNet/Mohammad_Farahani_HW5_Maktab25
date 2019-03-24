package NewspaperSubscription;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public String setAddress(String address) {
        boolean haveDigit = checkForDigit(address);
        if(haveDigit) {
            this.address = address;
            setSubscriptionRate(15.00);
            return("That is a valid address.");
        }
        else {
            setSubscriptionRate(0.00);
            return("That is a invalid address.needs one digit in your address");
        }
    }

    public boolean checkForDigit(String address) {
        boolean have = false;
        for(int i = 0; i < address.length(); i++) {
            if(Character.isDigit(address.charAt(i))) {
                have = true;
                break;
            }
            else {
                have = false;
            }
        }
        return have;
    }

}
