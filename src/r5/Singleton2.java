package r5;

public class Singleton2 {
    public static Singleton2 getInstance()
    {
        return HelperHolder.INSTANCE;
    }
    private Singleton2(){}
    private static class HelperHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}
