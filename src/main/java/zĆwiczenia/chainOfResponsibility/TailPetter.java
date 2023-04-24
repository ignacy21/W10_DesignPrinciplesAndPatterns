package zĆwiczenia.chainOfResponsibility;

public class TailPetter implements CatPetter {

    private CatPetter catPetter;

    @Override
    public void setNextPetter(CatPetter nextPetter) {
        this.catPetter = nextPetter;
    }

    @Override
    public void pet(Cat catWhoWantsToBePet) {
        System.out.println("pulling cat's tail MEEEEOOOWWW");
    }
}
