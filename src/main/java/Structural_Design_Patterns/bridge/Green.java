package Structural_Design_Patterns.bridge;

import lombok.ToString;

@ToString
public class Green implements Color {
    @Override
    public String apply() {
        return "Color is green";
    }
}
