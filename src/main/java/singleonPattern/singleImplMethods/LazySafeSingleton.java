package singleonPattern.singleImplMethods;

/**
 * 懒汉式，线程安全
 * 加锁会影响效率
 *
 * @author ginger
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;
    private LazySafeSingleton(){}

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }

        return instance;
    }
}
