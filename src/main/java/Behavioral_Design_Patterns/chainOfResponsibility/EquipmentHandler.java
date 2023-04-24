package Behavioral_Design_Patterns.chainOfResponsibility;

import java.util.Objects;

public class EquipmentHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void hande(Car car) {
        if (Objects.nonNull(car.getEquipment())) {
            System.out.printf("Preparing Equipment: %s%n", car.getEquipment());
            this.nextHandler.hande(car);
        } else {
            this.nextHandler.hande(car);
        }
    }
}
