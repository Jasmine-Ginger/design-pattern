package singleonPattern.singleImplMethods;

/**
 * 饿汉式
 * 浪费内存
 *
 * @author ginger
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
