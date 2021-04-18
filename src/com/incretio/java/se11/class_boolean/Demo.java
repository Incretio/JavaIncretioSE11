package com.incretio.java.se11.class_boolean;

// class java.lang.Boolean demonstration
public class Demo {

    public static void main(String[] args) {
//        constructorOne();
//        constructorTwo();
    }

    // deprecated constructor by boolean
    private static void constructorOne() {
        // example 1
        {
            boolean type = true;
            boolean sourceValue = true;
            Boolean booleanObject = new Boolean(sourceValue);
            System.out.println("sourceValue = true. Actual value = " + booleanObject);
        }
        // example 2
        {
            boolean sourceValue = false;
            Boolean booleanObject = new Boolean(sourceValue);
            System.out.println("sourceValue = false. Actual value = " + booleanObject);
        }

    }

    // deprecated constructor by String
    private static void constructorTwo() {
        // example 3
        {
            String sourceValue = "true";
            Boolean booleanObject = new Boolean(sourceValue);
            System.out.println("sourceValue = \"true\". Actual value = " + booleanObject);
        }
        // example 4
        {
            String sourceValue = "false";
            Boolean booleanObject = new Boolean(sourceValue);
            System.out.println("sourceValue = \"false\". Actual value = " + booleanObject);
        }
    }

    // implicit type conversion
    private static void implicitTypeConversion() {
        // example 5
        {
            boolean sourceValue = true;
            Boolean booleanObject = sourceValue;
            System.out.println("sourceValue = false. Actual value = " + booleanObject);
        }
        // example 6
        {
            boolean sourceValue = false;
            Boolean booleanObject = sourceValue;
            System.out.println("sourceValue = false. Actual value = " + booleanObject);
        }
    }
}
