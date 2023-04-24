package Behavioral_Design_Patterns.chainOfResponsibility;

public class QualityCheckHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void hande(Car car) {
        System.out.println("Checking quality!");
    }
}
