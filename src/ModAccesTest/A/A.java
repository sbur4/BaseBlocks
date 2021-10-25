package ModAccesTest.A;

class SubA extends A {
    public static void main(String[] args) {
        System.out.println(aSecond);
        System.out.println(aThird);
        System.out.println(aFourth);
    }
}

public class A {
    private static String aFirst = "private A";
    protected static String aSecond = "protected A";
    static String aThird = "default A";
    public static String aFourth = "public A";

    public static void main(String[] args) {
        System.out.println(aFirst);
        System.out.println(aSecond);
        System.out.println(aThird);
        System.out.println(aFourth);
    }
}
