package Creational_Design_Patterns.factory;

public class PepperoniPizza implements Pizza {
    @Override
    public String whatSauce() {
        return "spicy sauce";
    }

    @Override
    public void bake() {
        System.out.println("Baking pepperoni");
    }

    public static void moreSalami() {
        System.out.println("more salami");
    }
}
