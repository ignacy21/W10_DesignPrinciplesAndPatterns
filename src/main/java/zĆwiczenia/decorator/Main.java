package zĆwiczenia.decorator;

public class Main {

    public static void main(String[] args) {

        Car car = new CarImpl();
        OnlyDecorator decorator = new OnlyDecorator(car);
        System.out.println(decorator.decorate());
    }
}
