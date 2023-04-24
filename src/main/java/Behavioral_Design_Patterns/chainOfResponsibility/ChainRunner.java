package Behavioral_Design_Patterns.chainOfResponsibility;

import java.util.List;

public class ChainRunner {
    private final CarHandler carHandler;

    public ChainRunner() {
        this.carHandler = new CabrioletHandler();
        CarHandler carHandler2 = new JeepHandler();
        CarHandler carHandler3 = new ColorHandler();
        CarHandler carHandler4 = new EquipmentHandler();
        CarHandler carHandler5 = new QualityCheckHandler();

        carHandler.setNextHandler(carHandler2);
        carHandler2.setNextHandler(carHandler3);
        carHandler3.setNextHandler(carHandler4);
        carHandler4.setNextHandler(carHandler5);
        carHandler5.setNextHandler(null);
    }

    public static void main(String[] args) {
        ChainRunner chainRunner = new ChainRunner();
        chainRunner.carHandler.hande(Car.of(Car.Type.CABRIOLET, "Blue", List.of("steering wheel")));
        System.out.println();
        chainRunner.carHandler.hande(Car.of(Car.Type.JEEP, "Black", List.of("wheel")));
    }

}
