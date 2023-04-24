package zĆwiczenia.chainOfResponsibility;

public class EarsPetter implements CatPetter {

    private CatPetter catPetter;

    @Override
    public void setNextPetter(CatPetter nextPetter) {
        this.catPetter = nextPetter;
    }

    @Override
    public void pet(Cat catWhoWantsToBePet) {
        System.out.println("petting cat's ears");
        this.catPetter.pet(catWhoWantsToBePet);
    }
}
