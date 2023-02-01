package Creational_Design_Patterns.singleton;

public class LazySingleton {

    private static LazySingleton LAZY_SINGLETON;

//    static {
//        try {
//            LAZY_SINGLETON = new LazySingleton();
//        } catch (Exception e) {
//            throw new RuntimeException("Fail during initializing LAZY_SINGLETON");
//        }
//    }

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
