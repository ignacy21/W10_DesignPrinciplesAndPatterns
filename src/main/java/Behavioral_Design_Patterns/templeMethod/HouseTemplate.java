package Behavioral_Design_Patterns.templeMethod;

public abstract class HouseTemplate {

    public final void build() {
        digHole();
        buildFoundations();
        buildWalls();
        makeRoof();
        insertWindows();
    }

    protected void digHole() {
        System.out.println("Digging hole");
    }

    protected abstract void buildFoundations();
    protected abstract void buildWalls();
    protected abstract void makeRoof();
    protected abstract void insertWindows();

}
