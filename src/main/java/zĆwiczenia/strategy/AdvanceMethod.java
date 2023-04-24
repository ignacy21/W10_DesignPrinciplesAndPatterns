package zĆwiczenia.strategy;

public class AdvanceMethod implements Sewing{

    @Override
    public void sew() {
        System.out.println("sewing " + getClass().getSimpleName());
    }
}
