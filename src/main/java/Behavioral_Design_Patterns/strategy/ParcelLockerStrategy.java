package Behavioral_Design_Patterns.strategy;

public class ParcelLockerStrategy implements DeliveryStrategy {
    @Override
    public void deliver(Parcel parcel) {
        System.out.printf("Parcel %s delivered by ParcelLocker %n", parcel.getName());
    }
}
