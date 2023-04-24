package Behavioral_Design_Patterns.templeMethod;

public class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildFoundations() {
        System.out.println("WoodenHouse buildFoundations");
    }

    @Override
    protected void buildWalls() {
        System.out.println("WoodenHouse buildWalls");
    }

    @Override
    protected void makeRoof() {
        System.out.println("WoodenHouse makeRoof");
    }

    @Override
    protected void insertWindows() {
        System.out.println("WoodenHouse insertWindows");
    }
}
