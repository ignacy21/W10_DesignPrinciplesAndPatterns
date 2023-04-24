package zĆwiczenia.chainOfResponsibility;

public interface CatPetter {

    void setNextPetter(CatPetter nextPetter);

    void pet(Cat catWhoWantsToBePet);
}
