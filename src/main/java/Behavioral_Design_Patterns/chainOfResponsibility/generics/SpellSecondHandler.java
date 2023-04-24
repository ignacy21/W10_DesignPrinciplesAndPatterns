package Behavioral_Design_Patterns.chainOfResponsibility.generics;

public class SpellSecondHandler extends GenericHandler<String> {
    @Override
    protected String handeInput(String input) {
        return input.replace("siubidubidam", "czarymary");
    }
}
