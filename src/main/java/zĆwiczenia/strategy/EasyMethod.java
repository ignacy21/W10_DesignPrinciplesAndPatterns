package zĆwiczenia.strategy;

import zĆwiczenia.strategy.Sewing;

public class EasyMethod implements Sewing {

    @Override
    public void sew() {
        System.out.println("sewing " + getClass().getSimpleName());
    }
}
