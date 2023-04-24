package Behavioral_Design_Patterns.chainOfResponsibility;

import java.util.Objects;

public class ColorHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void hande(Car car) {
        if (Objects.nonNull(car.getColor())) {
            System.out.printf("Preparing %s color %n", car.getColor());
            this.nextHandler.hande(car);
        } else {
            this.nextHandler.hande(car);
        }
    }
}
