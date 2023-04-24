package zĆwiczenia.composite;

import java.util.ArrayList;
import java.util.List;

public class WaterAllPlants implements Plant {

    private final List<Plant> plantList = new ArrayList<>();

    @Override
    public void water(Double liters) {

    }

    public void addToWaterPlantList(Plant plant) {
        plantList.add(plant);
    }

    public void waterAll(Double liters) {
        plantList.forEach(plant -> {
            if (plant instanceof Cactus) {
                System.out.println("Cactus doesn't need to be watered");
            } else {
                plant.water(liters);
            }
        });
    }
}
