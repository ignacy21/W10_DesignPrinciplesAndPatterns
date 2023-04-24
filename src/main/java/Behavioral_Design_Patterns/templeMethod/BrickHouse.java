package Behavioral_Design_Patterns.templeMethod;

public class BrickHouse extends HouseTemplate {
    @Override
    protected void buildFoundations() {
        System.out.println("BrickHouse buildFoundations");
    }

    @Override
    protected void buildWalls() {
        System.out.println("BrickHouse buildWalls");
    }

    @Override
    protected void makeRoof() {
        System.out.println("BrickHouse makeRoof");
    }

    @Override
    protected void insertWindows() {
        System.out.println("BrickHouse insertWindows");
    }
}
