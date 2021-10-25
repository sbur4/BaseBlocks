package FinalTest;

//fianl class
final class SubTask4 {
    public void say() {
        System.out.println("FINAl CLASS");
    }

}

public class Task4 {
    //final method
    private static final void msg() {
        System.out.println("FINAl METHOD");
    }

    public static void main(String[] args) {
        //final var
        int x = 77;
        System.out.println(x);
        final int y = 88;
        x += 5;
//        y += 5;
        System.out.println(x);
        msg();

        SubTask4 st1 = new SubTask4();
        st1.say();

        //immutable String
        String str = "Base";
        str.concat("Blocks");//In the string constant pool,remains unchanged,
        System.out.println(str);
        str += "#";//object is created
        System.out.println(str);
    }
}
