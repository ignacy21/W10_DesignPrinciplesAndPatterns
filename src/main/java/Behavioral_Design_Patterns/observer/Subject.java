package Behavioral_Design_Patterns.observer;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);
}
