package Structural_Design_Patterns.composite;

public class Elephant implements Animal {
    @Override
    public void eat(Food food) {
        System.out.println("Elephant eating food: " + food);
    }
}
