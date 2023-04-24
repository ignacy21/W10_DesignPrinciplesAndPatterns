package zĆwiczenia.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OnlyDecorator implements Car {

    private final Car car;

    @Override
    public String decorate() {
        String decorate = car.decorate();
        return decorate + insideDecoratingMethod();
    }

    private static String insideDecoratingMethod() {
        return " jabadabadu";
    }
}
