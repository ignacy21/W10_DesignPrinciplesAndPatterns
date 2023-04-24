package Behavioral_Design_Patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {

    List<Parcel> parcels = new ArrayList<>();

    public void addParcel(final Parcel parcel) {
        parcels.add(parcel);
    }

    public void deliver(DeliveryStrategy deliveryStrategy) {
        for (Parcel parcel : parcels) {
            deliveryStrategy.deliver(parcel);
        }
    }
}
