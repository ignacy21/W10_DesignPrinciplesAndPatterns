package zĆwiczenia.strategy;

public class Main {

    public static void main(String[] args) {
        Sewing easyMethod = new EasyMethod();

        Sew sew1 = new Sew(easyMethod);
        Sew sew2 = new Sew(new AdvanceMethod());

        sew1.sewMaterial();
        sew2.sewMaterial();
    }
}
