package Structural_Design_Patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ZOO implements Animal {

    private final List<Animal> animals = new ArrayList<>();

    @Override
    public void eat(Food food) {
        animals.forEach(animal -> animal.eat(food));
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }
    public void remove(Animal animal) {
        this.animals.remove(animal);
    }
    public void clear(Animal animal) {
        this.animals.clear();
    }
}
