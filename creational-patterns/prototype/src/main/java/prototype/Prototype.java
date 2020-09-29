package prototype;

import java.util.Arrays;

public abstract class Prototype implements Cloneable {

    private int integerField = 5;
    private String stringField = "string";  // String is immutable, therefore it does not implement Cloneable
    private int[] arrayField = { 1, 2, 3, 4, 5 };  // arrays implement cloneable interface

    public Prototype clone() throws CloneNotSupportedException {
        // We need to make deep copy since we have non-primitive mutable fields
        Prototype clone = (Prototype)super.clone();
        // clone.stringField = stringField.clone();  // error, clone in Object has private access
        clone.arrayField = arrayField.clone();

        return clone;
    }

    public int getIntegerField() {
        return integerField;
    }

    public String getStringField() {
        return stringField;
    }

    public int[] getArrayField() {
        return arrayField;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "integerField=" + integerField +
                ", stringField='" + stringField + '\'' +
                ", arrayField=" + Arrays.toString(arrayField) +
                '}';
    }

}
