package zĆwiczenia.decorator;

public class WhateverDecorator extends CarDecorator {

    public WhateverDecorator(Car car) {
        super(car);
    }

    @Override
    public String decorate() {
        String s = super.decorate();
        return s + decorationMethod();
    }

    private static String decorationMethod() {
        return " decorated done";
    }
}
