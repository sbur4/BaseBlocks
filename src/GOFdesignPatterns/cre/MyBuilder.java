package GOFdesignPatterns.cre;

public class MyBuilder {
    //required parameters
    private String CUP;
    private String TEA;
    private String WATER;

    //optional parameters
    private boolean isCupClean;
    private boolean isGreenTea;
    private boolean isWaterClean;

    public String getCup() {
        return CUP;
    }

    public String getTea() {
        return TEA;
    }

    public String getWater() {
        return WATER;
    }

    public boolean isCupClean() {
        return isCupClean;
    }

    public boolean isGreenTea() {
        return isGreenTea;
    }

    public boolean isWaterClean() {
        return isWaterClean;
    }

    private MyBuilder(MyBuilder.TeaBuilder myBuilder) {
        this.CUP = myBuilder.CUP;
        this.TEA = myBuilder.TEA;
        this.WATER = myBuilder.WATER;
        this.isCupClean = myBuilder.isCupClean;
        this.isGreenTea = myBuilder.isGreenTea;
        this.isWaterClean = myBuilder.isWaterClean;
    }

    //Builder Class
    public static class TeaBuilder {

        // required parameters
        private String CUP;
        private String TEA;
        private String WATER;

        // optional parameters
        private boolean isCupClean;
        private boolean isGreenTea;
        private boolean isWaterClean;

        public TeaBuilder(String cup, String tea, String water) {
            this.CUP = cup;
            this.TEA = tea;
            this.WATER = water;
        }

        public MyBuilder.TeaBuilder setCupClean(boolean isCupClean) {
            this.isCupClean = isCupClean;
            return this;
        }

        public MyBuilder.TeaBuilder setGreenTea(boolean isGreenTea) {
            this.isGreenTea = isGreenTea;
            return this;
        }

        public MyBuilder.TeaBuilder setWaterClean(boolean isWaterClean) {
            this.isWaterClean = isWaterClean;
            return this;
        }

        public MyBuilder myBuild() {
            return new MyBuilder(this);
        }
    }
}
