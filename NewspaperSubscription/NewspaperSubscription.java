package NewspaperSubscription;

public abstract class NewspaperSubscription {

    private String subscriberName;
    protected String address;
    private double subscriptionRate;

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

    public abstract String setAddress(String address);




}
