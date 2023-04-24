package Behavioral_Design_Patterns.chainOfResponsibility.generics;

public class SpellFinalHandler extends GenericHandler<String> {
    @Override
    protected String handeInput(String input) {
        return input.replace("mniam mniam mniam", "posiadam dwa browary");
    }
}
