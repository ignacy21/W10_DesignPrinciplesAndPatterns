package Creational_Design_Patterns.factory;

public class FactoryProvider {

    public static AbstractFactory<?> getFactory(String whatFactory) {
        return switch (whatFactory) {
            case "Pizza" -> new PizzaFactory();
            case "Car" -> new CarFactory();
            default -> throw new RuntimeException(String.format("There is no such factory as [%s]", whatFactory));
        };
    }
}
