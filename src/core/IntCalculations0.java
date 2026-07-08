package core;

public class IntCalculations0 {

    static void main() {
        System.out.println((int)getDataTypesIntA());
        System.out.println((int)getDataTypesIntB());
        System.out.println(getDataTypesDoubleA());
    }

    public static double getDataTypesIntA() {
        int a = 0;
        a = 5%2;
        return a;
    }

    public static double getDataTypesIntB(){
        int b = 0;
        b=5/2;
        return b;
    }

    public static double getDataTypesDoubleA() {
        double a = 0;
        a = 5.0 % 1.5;
        return a;
    }
}
