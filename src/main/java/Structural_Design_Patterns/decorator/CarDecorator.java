package Structural_Design_Patterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public abstract class CarDecorator implements Car {

    private final Car car;

    @Override
    public String create() {
        return car.create();
    }
}
