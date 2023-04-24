package Behavioral_Design_Patterns.chainOfResponsibility.generics;

public abstract class GenericHandler<T> {
    protected GenericHandler<T> nextHandler;

    public void setNextHandler(GenericHandler<T> nextHandler) {
        this.nextHandler = nextHandler;
    }

    public T handle(T input) {
        T t = handeInput(input);
        if (nextHandler != null) {
            return nextHandler.handle(t);
        }
        return t;
    }

    protected abstract T handeInput(T input);
}
