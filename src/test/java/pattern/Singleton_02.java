package pattern;

/**
 * 懒汉模式
 */
public class Singleton_02 {
    /**
     * volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障，
     * 这样，在它的赋值完成之前，就不用会调用读操作。
     */
    private static volatile Singleton_02 instance = null;

    private Singleton_02() {
    }

    public static Singleton_02 getInstance() {
        if (instance == null) {
            synchronized (Singleton_02.class) {
                if (instance == null) {
                    instance = new Singleton_02();
                }
            }
        }
        return instance;
    }

}
