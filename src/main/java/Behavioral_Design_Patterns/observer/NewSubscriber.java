package Behavioral_Design_Patterns.observer;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class NewSubscriber implements Observer {

    private final String username;

    @Override
    public void update(String message) {
        if (Objects.isNull(message)) {
            System.out.printf("%s - Message null%n", username);
        } else {
            System.out.printf("%s - Message - %s%n", username, message);
        }
    }
}
