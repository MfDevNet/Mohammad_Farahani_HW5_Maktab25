package NewspaperSubscription;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    // Override setAddress
    @Override
    public String setAddress(String address) {
        boolean containsSymbol = checkValidAddress(address);
        if(containsSymbol) {
            setSubscriptionRate(9.00);
            this.address = address;
            return("That is a valid address.");

        }
        else {
            return("That is an invalid address. The address must have an \"@\" .");
        }
    }
    // check valid address Email
    public boolean checkValidAddress(String address) {
        for(int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '@') {
                return true;
            }
        }
        return false;
    }

}
