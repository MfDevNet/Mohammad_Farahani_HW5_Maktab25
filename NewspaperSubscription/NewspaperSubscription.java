package NewspaperSubscription;

public abstract class NewspaperSubscription {
    // variable
    private String subscriberName;
    protected String address;
    private double subscriptionRate;

    // block setter and getter
    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberName() {
        return subscriberName;
    }
    public String getAddress() {
        return address;
    }
    public double getSubscriptionRate() {
        return subscriptionRate;
    }

    public void setSubscriptionRate(double subscriptionRate) {
        this.subscriptionRate = subscriptionRate;
    }
    //abstract method
    public abstract String setAddress(String address);




}
