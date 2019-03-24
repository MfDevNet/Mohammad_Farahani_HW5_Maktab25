package NewspaperSubscription;

public class DemoSubscriptions {
    public static void main(String[] args) {

        //Block Test Valid data
        System.out.println("---------------------------------------");
        System.out.println("Block Test Valid data");
        PhysicalNewspaperSubscription news1 = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription news2 = new OnlineNewspaperSubscription();

        news1.setSubscriberName("Mr Farahani");
        System.out.println(news1.setAddress("421 S. Farahani Developer."));//Valid

        news2.setSubscriberName("Mr Farahani");
        System.out.println(news2.setAddress("msghf1366@gmail.com")); //Valid

        System.out.println(news1.getSubscriberName() + " address "
                + news1.getAddress() + "\n payment " + news1.getSubscriptionRate());
        System.out.println(news2.getSubscriberName() + " email "
                + news2.getAddress() + "\n payment " + news2.getSubscriptionRate());


        //Block Test Invalid data
         System.out.println("---------------------------------------");
                System.out.println("Block Test InValid data");
        PhysicalNewspaperSubscription news3 = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription news4 = new OnlineNewspaperSubscription();
        news3.setSubscriberName("Invalid one");
        System.out.println(news3.setAddress("tehran"));//invalid

        news4.setSubscriberName("Invalid Two");
        System.out.println(news4.setAddress("noEmail"));//invalid

        System.out.println(news3.getSubscriberName() + " address "
                + news3.getAddress() + "\n payment " + news3.getSubscriptionRate());
        System.out.println(news4.getSubscriberName() + " email "
                + news4.getAddress() + "\n payment " + news4.getSubscriptionRate());


    }
}
