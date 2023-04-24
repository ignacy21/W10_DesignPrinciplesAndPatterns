package zĆwiczenia.composite;

import lombok.Data;

@Data
public class Orchid implements Plant {
    @Override
    public void water(Double liters) {
        System.out.printf("%s being water: %s liters %n", getClass().getSimpleName(), liters);
    }
}
