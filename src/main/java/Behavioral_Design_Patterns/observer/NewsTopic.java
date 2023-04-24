package Behavioral_Design_Patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewsTopic implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        if (Objects.isNull(observer)) {
            throw new NullPointerException("Observer is null");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String message) {
        System.out.printf("Message posted: %s%n", message);
        observers.forEach(observer -> observer.update(message));

    }
}
