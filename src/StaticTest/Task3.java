package StaticTest;

public class Task3 {
    //static field
    private static int a = 5;
    private int b = 3;

    public Task3() {
    }

    public Task3(int b) {
        this.b = b;
        sum(b);
    }

    //static block
    static {
        int c = 7;
        System.out.println("static block " + c);
        String str = "C";
        System.out.println("Hello " + str);
        showStatic();
    }

    //static class
    static class SubTask3 {
        void msg() {
            System.out.println("static class " + a);
        }
    }

    public static void main(String[] args) {
        System.out.println("static var " + a);
//        System.out.println(b); //error
        showStatic();
        Task3 t1 = new Task3();
        System.out.println("non static var " + t1.b);
        System.out.println(t1.sum(t1.b));
//        System.out.println(c);//error
        SubTask3 st1 = new SubTask3();
        st1.msg();
    }

    //static method
    private static void showStatic() {
        System.out.println(a + a);
//        System.out.println(b);//error
    }

    private int sum(int b) {
        return b + b;
    }
}
