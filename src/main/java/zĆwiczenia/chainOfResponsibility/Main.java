package zĆwiczenia.chainOfResponsibility;

public class Main {

    private final CatPetter furPetter;

    public Main() {
        this.furPetter = new FurPetter();
        CatPetter earsPetter = new EarsPetter();
        CatPetter pawsPetter = new PawsPetter();
        CatPetter tailPetter = new TailPetter();

        furPetter.setNextPetter(earsPetter);
        earsPetter.setNextPetter(pawsPetter);
        pawsPetter.setNextPetter(tailPetter);
        tailPetter.setNextPetter(null);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();

        Main main = new Main();
        main.furPetter.pet(cat);
    }

}
