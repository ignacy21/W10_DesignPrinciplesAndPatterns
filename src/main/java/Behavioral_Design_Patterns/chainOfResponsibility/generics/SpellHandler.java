package Behavioral_Design_Patterns.chainOfResponsibility.generics;

public class SpellHandler extends GenericHandler<String> {
    @Override
    protected String handeInput(String input) {
        return input.replace("abrakadabra", "hokuspokus");
    }
}
