package Behavioral_Design_Patterns.chainOfResponsibility.generics;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
//        GenericHandler<String> spell1 = new SpellHandler();
//        GenericHandler<String> spell2 = new SpellSecondHandler();
//        GenericHandler<String> spell3 = new SpellFinalHandler();
//
//        spell1.setNextHandler(spell2);
//        spell2.setNextHandler(spell3);
//
//        String result = spell1.handle("abrakadabra siubidubidam mniam mniam mniam");
//        System.out.println(result);

        UnaryOperator<String> spellHandler1 = (String input) ->
                input.replace("abrakadabra", "hoskupokus");
        UnaryOperator<String> spellHandler2 = (String input) ->
                input.replace("siubidubidam", "czarymary");
        UnaryOperator<String> spellHandler3 = (String input) ->
                input.replace("mniam mniam mniam", "posiadam dwa browary");

        String input = "abrakadabra siubidubidam mniam mniam mniam";

        Function<String, String> pipeLine = spellHandler1
                .andThen(spellHandler2)
                .andThen(spellHandler3);
        String result = pipeLine.apply(input);
        System.out.println(result);


    }
}
