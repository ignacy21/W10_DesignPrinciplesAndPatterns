package Creational_Design_Patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CarFactory implements AbstractFactory<Car> {

    private static final Map<String, Supplier<Car>> CAR_MAP = new HashMap<>();

    static {
        CAR_MAP.put("Cabriolet", Cabriolet::new);
        CAR_MAP.put("SUV", SUV::new);
    }


    @Override
    public Car create(String type) {
        return Optional.ofNullable(CAR_MAP.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException("Sorry we don't have [" + type + "] type of car in our saloon"));
    }
}
