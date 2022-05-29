package singleonPattern.singleImplMethods;

/**
 * 登记式/静态内部类
 *
 * @author ginger
 */
public class StaticSingleton {

    private static class SingletonHolder{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton(){}

    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
