package ObjectTest;

class Alco implements Cloneable {
    private String rum;
    private int capacity;

    public Alco() {
    }

    public Alco(String rum, int capacity) {
        this.rum = rum;
        this.capacity = capacity;
    }

    public String getRum() {
        return rum;
    }

    public void setRum(String rum) {
        this.rum = rum;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Alco{" +
                "rum='" + rum + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test5 extends Alco {
    public static void main(String[] args) throws CloneNotSupportedException {
        Alco a1 = new Alco("Jim Beam", 1);
        Alco a2 = new Alco("Jameson", 2);
        Alco a3 = a1;
        Object a4 = new Object();

        System.out.println(a1.getClass() + " " + a2.getClass());
        System.out.println(a3.getClass() + " " + a4.getClass());

        System.out.println(a1.hashCode() + " " + a2.hashCode());
        System.out.println(a3.hashCode() + " " + a4.hashCode());

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a4));

        System.out.println(a1.toString());
        System.out.println(a2.toString());

        Alco a5 = (Alco) a2.clone();
        System.out.println(a5.getRum() + " " + a5.getCapacity());
        System.out.println(a5.toString());

    }
}
