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

    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "number=" + number +
                '}';
    }

}
