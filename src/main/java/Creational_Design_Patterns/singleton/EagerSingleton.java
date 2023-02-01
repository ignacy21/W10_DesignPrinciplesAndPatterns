package Creational_Design_Patterns.singleton;

public final class EagerSingleton {

    private static final EagerSingleton EAGER_SINGLETON;

    static {
        try {
            EAGER_SINGLETON = new EagerSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception thrown during initializing Singleton");
        }
    }

    private EagerSingleton() {
        System.out.println("Calling constructor");
    }

    public static EagerSingleton getInstance() {
        System.out.println("getInstance()");
        return EAGER_SINGLETON;
    }

    public static void someStaticMethod() {
        System.out.println("someStaticMethod()");
    }
}
