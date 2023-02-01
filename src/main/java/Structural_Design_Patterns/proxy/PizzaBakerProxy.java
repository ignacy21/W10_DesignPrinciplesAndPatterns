package Structural_Design_Patterns.proxy;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PizzaBakerProxy implements PizzaBaker {

    private final PizzaBaker pizzaBaker;
    public static final List<String> DENIED_PIZZA = List.of("Hawaiian");

    @Override
    public void bake(String pizza) {
        if (DENIED_PIZZA.contains(pizza)) {
            throw new RuntimeException(String.format("%s? We don't do this here!", pizza));
        } else {
            pizzaBaker.bake(pizza);
        }
    }
}
