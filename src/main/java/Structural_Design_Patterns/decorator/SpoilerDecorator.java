package Structural_Design_Patterns.decorator;

public class SpoilerDecorator extends CarDecorator {

    public SpoilerDecorator(Car car) {
        super(car);
    }

    @Override
    public String create() {
        return super.create() + withSpoiler();
    }

    private String withSpoiler() {
        return " with " + this.getClass().getSimpleName();
    }
}
