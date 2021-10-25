package GOFdesignPatterns.cre;

public class MySingeltone {
    //1
    private static MySingeltone instance;
    public String value;

    //4
    private MySingeltone(String value) {
        this.value = value;
    }

    //2
    public static MySingeltone getInstance(String value) {
        if (instance == null) {
            //3 lazy init
            instance = new MySingeltone(value);
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        //5
        MySingeltone mySingeltone = MySingeltone.getInstance("Start");
        MySingeltone newSingeltone = MySingeltone.getInstance("Next");
        System.out.println(mySingeltone.value);
        System.out.println(newSingeltone.value);
    }
}