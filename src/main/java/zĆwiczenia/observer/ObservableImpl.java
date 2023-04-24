package zĆwiczenia.observer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObservableImpl implements Observable {

    private final String name;

    @Override
    public void update(String message) {
        System.out.printf("[%s] message to - %s %n", message, name);
    }
}
