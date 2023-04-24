package Creational_Design_Patterns.builder;

import lombok.ToString;

@ToString
//@Builder
public class Car {

    private final String brand;
    private final String model;
    private final String year;
    private final String towbar;
    private final String sunRoof;
    private final String skiRack;


    private Car(final CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.model = carBuilder.model;
        this.year = carBuilder.year;
        this.towbar = carBuilder.towBar;
        this.sunRoof = carBuilder.sunRoof;
        this.skiRack = carBuilder.skiRack;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        private String brand;
        private String model;
        private String year;
        private String towBar;
        private String sunRoof;
        private String skiRack;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }
        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }
        public CarBuilder year(String year) {
            this.year = year;
            return this;
        }
        public CarBuilder towbar(String towbar) {
            this.towBar = towbar;
            return this;
        }
        public CarBuilder sunRoof(String sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }
        public CarBuilder skiRack(String skiRack) {
            this.skiRack = skiRack;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
