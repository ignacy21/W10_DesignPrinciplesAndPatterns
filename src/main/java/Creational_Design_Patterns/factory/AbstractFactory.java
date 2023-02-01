package Creational_Design_Patterns.factory;

public interface AbstractFactory<T> {

    T create(String type);
}
