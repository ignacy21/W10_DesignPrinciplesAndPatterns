package zĆwiczenia.composite;

public class Main {

    public static void main(String[] args) {
        WaterAllPlants waterAllPlants = new WaterAllPlants();
        waterAllPlants.addToWaterPlantList(new Aloes());
        waterAllPlants.addToWaterPlantList(new Orchid());
        waterAllPlants.addToWaterPlantList(new Cactus());
        waterAllPlants.waterAll(0.2);
    }
}
