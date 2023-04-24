package Behavioral_Design_Patterns.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class CabrioletHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void hande(Car car) {
        if (Car.Type.CABRIOLET.equals(car.getType())) {
            System.out.println("Preparing Cabriolet Skeleton");
            final List<String> cabrioletEquipment = new ArrayList<>(car.getEquipment());
            cabrioletEquipment.add("Cabriolet roof");
            this.nextHandler.hande(car.withEquipment(cabrioletEquipment));
        } else {
            this.nextHandler.hande(car);
        }
    }
}
