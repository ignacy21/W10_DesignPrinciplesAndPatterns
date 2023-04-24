package Behavioral_Design_Patterns.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class JeepHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void hande(Car car) {
        if (Car.Type.JEEP.equals(car.getType())) {
            System.out.println("Preparing Jeep Skeleton");
            final List<String> jeepEquipment = new ArrayList<>(car.getEquipment());
            jeepEquipment.add("Spare wheel");
            this.nextHandler.hande(car.withEquipment(jeepEquipment));
        } else {
            this.nextHandler.hande(car);
        }
    }
}
