package Creational_Design_Patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class PizzaFactory implements AbstractFactory<Pizza> {

    private static final Map<String, Supplier<Pizza>> PIZZA_MENU = new HashMap<>();

    static {
        PIZZA_MENU.put("Pepperoni", PepperoniPizza::new);
        PIZZA_MENU.put("Hawaiian", HawaiianPizza::new);
    }


    @Override
    public Pizza create(String type) {
        return Optional.ofNullable(PIZZA_MENU.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException("Sorry we don't have [" + type + "] pizza in our menu"));
    }
}
