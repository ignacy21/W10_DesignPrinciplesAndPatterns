package Creational_Design_Patterns.prototype;

import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Data
public class PrototypeCar implements Cloneable {

    private SteeringWheel steeringWheel;
    private String brand;
    private String model;
    private List<String> doors;

    public PrototypeCar() {
        this.brand = "Ford";
        this.model = "Mustang";
        this.steeringWheel = SteeringWheel.of(10.65);
        this.doors = new ArrayList<>(List.of("lf", "rf", "lr", "rr"));
    }

    @Override
    public PrototypeCar clone() throws CloneNotSupportedException {
        final PrototypeCar cloned = (PrototypeCar) super.clone();
        cloned.steeringWheel = this.steeringWheel.clone();
        cloned.doors = new ArrayList<>(this.doors);
        return cloned;
    }
}
