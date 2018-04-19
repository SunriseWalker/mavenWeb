package pattern;

/**
 * 饿汉模式
 * 类装载的时机：
     new一个对象时
     使用反射创建它的实例时
     子类被加载时，如果父类还没有加载，就先加载父类
     JVM启动时执行主类 会先被加载
 */
public class Singleton_01 {
    private static Singleton_01 ourInstance = new Singleton_01();

    public static Singleton_01 getInstance() {
        return ourInstance;
    }

    private Singleton_01() {
    }
}
