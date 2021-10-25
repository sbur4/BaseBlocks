package ConstructorTest;

public class Cons {
    private int id;
    private String name;
    private Character ch;

    public Cons() {
    }

    public Cons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cons(Character ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Cons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ch=" + ch +
                '}';
    }

    public static void main(String[] args) {
        Cons c1 = new Cons(3,"third");
        Cons c2 = new Cons('c');
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
