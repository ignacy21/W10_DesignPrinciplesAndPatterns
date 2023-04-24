package Structural_Design_Patterns.bridge;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public abstract class Shape {

    protected Color color;

    public abstract void applyColor();



}
