package zĆwiczenia.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObserverImpl implements Observer {

    private final List<Observable> observableList = new ArrayList<>();

    @Override
    public void addToObserverList(Observable observable) {
        if (Objects.isNull(observable)) {
            throw new RuntimeException("observable Object is null");
        } else {
            if (!observableList.contains(observable)) {
                observableList.add(observable);
            }
        }
    }

    @Override
    public void removeFromObserverList(Observable observable) {
        if (Objects.isNull(observable)) {
            throw new RuntimeException("observable Object is null");
        } else {
                observableList.remove(observable);
        }
    }

    public void sendMessage(String message) {
        if (message == null) {
            throw new RuntimeException("message is null");
        }
        for (Observable observable : observableList) {
            observable.update(message);
        }
    }
}
