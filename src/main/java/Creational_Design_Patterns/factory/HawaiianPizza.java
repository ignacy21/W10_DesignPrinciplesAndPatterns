package Creational_Design_Patterns.factory;

public class HawaiianPizza implements Pizza {

    @Override
    public String whatSauce() {
        return "normal sauce";
    }

    @Override
    public void bake() {
        System.out.println("Baking Hawaiian pizza");
    }

    public static void morePineapple() {
        System.out.println("more pineapple");
    }
}
