package Structural_Design_Patterns.decorator;

import lombok.Data;

public class CarImpl implements Car {


    @Override
    public String create() {
        return "Car";
    }
}
