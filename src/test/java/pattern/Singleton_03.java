package pattern;

public class Singleton_03 {

    private static class SingletonHolder {
        private static final Singleton_03 INSTANCE = new Singleton_03();
    }

    private Singleton_03() {
    }

    public static Singleton_03 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
