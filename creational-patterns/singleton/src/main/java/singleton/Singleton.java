package singleton;

public class Singleton {

    private static Singleton singleObject;

    private Singleton() { }

    public static Singleton getInstance() {
        if (singleObject == null) {
            singleObject = new Singleton();
        }

        return singleObject;
    }

}
