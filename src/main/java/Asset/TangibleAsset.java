package Asset;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private int weight;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        if (this.weight < 0) {
            throw new IllegalArgumentException("무게는 0 이상이어야 한다");
        }
        this.weight = weight;
    }
}
