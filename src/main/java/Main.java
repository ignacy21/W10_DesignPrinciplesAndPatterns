import Structural_Design_Patterns.proxy.PizzaBaker;
import Structural_Design_Patterns.proxy.PizzaBakerImpl;
import Structural_Design_Patterns.proxy.PizzaBakerProxy;
import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//        AbstractFactory<?> pizzaFactory = FactoryProvider.getFactory("Pizza");
//        Object hawaiian = pizzaFactory.create("Hawaiian");
//        System.out.println(hawaiian);
//        AbstractFactory<?> carFactory = FactoryProvider.getFactory("Car");
//        carFactory.create("SUV");
//
//        Car car = Car.builder()
//                .brand("Mercedes")
//                .model("S-class")
//                .skiRack("skiRack")
//                .build();
//        System.out.println(car);


//        PrototypeCar original = new PrototypeCar();
//        System.out.println(original);
//
//        PrototypeCar cloned = original.clone();
//        System.out.println(cloned);


//        Dimension dimension = new SonyTV();
//        DimensionAdapter dimensionAdapter = new DimensionAdapterImpl(dimension);
//
//        System.out.println(dimension.getDimension());
//        System.out.println(dimensionAdapter.getDimension());


//        ZOO zoo = new ZOO();
//        zoo.add(new Monkey());
//        zoo.add(new Elephant());
//        zoo.add(new Tiger());
//
//        Food food = new Food();
//        zoo.eat(food);


        PizzaBaker executor = new PizzaBakerProxy(new PizzaBakerImpl());
        executor.bake("Pepperoni");
        executor.bake("Margherita");
        executor.bake("Hawaiian");

    }
}
