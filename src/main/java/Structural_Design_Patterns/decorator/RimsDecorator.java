package Structural_Design_Patterns.decorator;

public class RimsDecorator extends CarDecorator {

    public RimsDecorator(Car car) {
        super(car);
    }

    @Override
    public String create() {
        return super.create() + withRims();
    }

    private String withRims() {
        return " with " + this.getClass().getSimpleName();
    }
}
