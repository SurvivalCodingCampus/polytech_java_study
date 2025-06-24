package Asset;

public abstract class TangibleAsset extends Asset implements Thing {

    protected double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name, price, color);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
