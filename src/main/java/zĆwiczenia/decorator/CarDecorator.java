package zĆwiczenia.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CarDecorator implements Car {

    private final Car car;

    @Override
    public String decorate() {
        return car.decorate();
    }
}
