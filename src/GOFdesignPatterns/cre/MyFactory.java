package GOFdesignPatterns.cre;

public abstract class MyFactory {
    public abstract String getRun();

    public abstract String getStop();

    public abstract String getBack();

    public abstract String getTurnRight();

    public abstract String getTurnLeft();

    @Override
    public String toString() {
        return "Run " + this.getRun() + ", Stop " + this.getStop() + ", Back" + this.getBack() + ", Right" + this.getTurnRight() + ", Left" + this.getTurnRight();
    }
}

class Car extends MyFactory {
    private String run;
    private String stop;
    private String back;
    private String right;
    private String left;

    public Car(String run, String stop, String back, String right, String left) {
        this.run = run;
        this.stop = stop;
        this.back = back;
        this.right = right;
        this.left = left;
    }

    @Override
    public String getRun() {
        return null;
    }

    @Override
    public String getStop() {
        return null;
    }

    @Override
    public String getBack() {
        return null;
    }

    @Override
    public String getTurnRight() {
        return null;
    }

    @Override
    public String getTurnLeft() {
        return null;
    }
}

class Bike extends MyFactory {
    private String run;
    private String stop;
    private String back;
    private String right;
    private String left;

    public Bike(String run, String stop, String back, String right, String left) {
        this.run = run;
        this.stop = stop;
        this.back = back;
        this.right = right;
        this.left = left;
    }

    @Override
    public String getRun() {
        return null;
    }

    @Override
    public String getStop() {
        return null;
    }

    @Override
    public String getBack() {
        return null;
    }

    @Override
    public String getTurnRight() {
        return null;
    }

    @Override
    public String getTurnLeft() {
        return null;
    }
}

class DriveFactory {
    public static MyFactory getMyFactory(String type, String run, String stop, String back, String right, String left) {
        if ("Car".equalsIgnoreCase(type)) return new Car(run, stop, back, right, left);
        else if ("Bike".equalsIgnoreCase(type)) return new Bike(run, stop, back, right, left);
        return null;
    }
}
