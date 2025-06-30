package Asset;

public class Computer extends TangibleAsset {

    String makerName;

    public Computer(String name, int price, String color) {
        super(name, price, color);
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
