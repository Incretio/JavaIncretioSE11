package com.incretio.java.se11.class_boolean;

// class java.lang.Boolean demonstration
public class Demo {

    public static void main(String[] args) {
//        constructorOne();
//        constructorTwo();
//        implicitTypeConversion();
//        staticFactoryByPrimitive();
//        staticFactoryByString();
    }

    // deprecated constructor by boolean
    private static void constructorOne() {
        // example 1
        {
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
            System.out.println("sourceValue = true. Actual value = " + booleanObject);
        }
        // example 6
        {
            boolean sourceValue = false;
            Boolean booleanObject = sourceValue;
            System.out.println("sourceValue = false. Actual value = " + booleanObject);
        }
        // example 7
        {
            Boolean booleanObject = true;
            System.out.println("sourceValue = true. Actual value = " + booleanObject);
        }
        // example 8
        {
            Boolean booleanObject = false;
            System.out.println("sourceValue = false. Actual value = " + booleanObject);
        }
    }

    // method as static factory by primitive
    private static void staticFactoryByPrimitive() {
        // example 9
        {
            boolean sourceValue = true;
            Boolean booleanObject = Boolean.valueOf(sourceValue);
            System.out.println("sourceValue = true. Actual value = " + booleanObject);
        }
        // example 10
        {
            boolean sourceValue = false;
            Boolean booleanObject = Boolean.valueOf(sourceValue);
            System.out.println("sourceValue = false. Actual value = " + booleanObject);
        }
    }

    // method as static factory by String
    private static void staticFactoryByString() {
        // example 11
        {
            String sourceValue = "true";
            Boolean booleanObject = Boolean.valueOf(sourceValue);
            System.out.println("sourceValue = \"true\". Actual value = " + booleanObject);
        }
        // example 12
        {
            String sourceValue = "false";
            Boolean booleanObject = Boolean.valueOf(sourceValue);
            System.out.println("sourceValue = \"false\". Actual value = " + booleanObject);
        }
    }

    // converting String to primitive
    private static void stringToPrimitive() {
        // example 13
        {
            String sourceValue = "true";
            boolean booleanPrimitive = Boolean.parseBoolean(sourceValue);
            System.out.println("sourceValue = \"true\". Actual value = " + booleanObject);
        }
        // example 14
        {
            String sourceValue = "false";
            boolean booleanPrimitive = Boolean.parseBoolean(sourceValue);
            System.out.println("sourceValue = \"false\". Actual value = " + booleanObject);
        }
    }

    // converting String to primitive
    private static void stringToPrimitive() {
        // example 15
        {
            String sourceValue = "true";
            boolean booleanPrimitive = Boolean.parseBoolean(sourceValue);
            System.out.println("sourceValue = \"true\". Actual value = " + booleanObject);
        }
        // example 16
        {
            String sourceValue = "false";
            boolean booleanPrimitive = Boolean.parseBoolean(sourceValue);
            System.out.println("sourceValue = \"false\". Actual value = " + booleanObject);
        }
    }

    private static void m() {
        boolean result = new Boolean(true) == new Boolean(false);
        System.out.println(result);

        boolean result2 = Boolean.valueOf(true) == Boolean.valueOf("true");
        System.out.println(result2);
    }
}
