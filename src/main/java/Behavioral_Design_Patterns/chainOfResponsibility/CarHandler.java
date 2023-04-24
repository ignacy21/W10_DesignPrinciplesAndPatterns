package Behavioral_Design_Patterns.chainOfResponsibility;

public interface CarHandler {

    void setNextHandler(CarHandler carHandler);

    void hande(Car car);
}
