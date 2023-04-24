package Behavioral_Design_Patterns.strategy;

public class PostStrategy implements DeliveryStrategy {
    @Override
    public void deliver(Parcel parcel) {
        System.out.printf("Parcel %s delivered by Post %n", parcel.getName());
    }
}
