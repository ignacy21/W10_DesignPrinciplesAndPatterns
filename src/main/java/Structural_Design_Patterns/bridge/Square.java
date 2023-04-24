package Structural_Design_Patterns.bridge;

import lombok.ToString;

@ToString(callSuper = true)
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Square with color " + color.apply());
    }
}
