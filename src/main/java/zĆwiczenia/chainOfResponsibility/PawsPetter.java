package zĆwiczenia.chainOfResponsibility;

public class PawsPetter implements CatPetter {

    private CatPetter catPetter;

    @Override
    public void setNextPetter(CatPetter nextPetter) {
        this.catPetter = nextPetter;
    }

    @Override
    public void pet(Cat catWhoWantsToBePet) {
        System.out.println("petting cat's paws");
        this.catPetter.pet(catWhoWantsToBePet);
    }
}
