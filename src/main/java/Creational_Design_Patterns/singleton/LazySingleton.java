package Creational_Design_Patterns.singleton;

public final class LazySingleton {

    private static LazySingleton LAZY_SINGLETON;

    private LazySingleton() {
        System.out.println("Calling constructor");
    }

    public static LazySingleton getInstance() {
        System.out.println("getInstance()");
        if (LAZY_SINGLETON == null) {
            LAZY_SINGLETON = new LazySingleton();
        }
        return LAZY_SINGLETON;
    }

    public static void someStaticMethod() {
        System.out.println("someStaticMethod()");
    }
}
