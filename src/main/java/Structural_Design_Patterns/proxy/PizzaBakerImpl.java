package Structural_Design_Patterns.proxy;

public class PizzaBakerImpl implements PizzaBaker {

    @Override
    public void bake(String pizza) {
        System.out.println("Baking pizza: " + pizza);
    }
}
