public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;  // Thing 인터페이스 구현을 위한 필드

    public TangibleAsset(String name, int price, String color) {
        super(name, price);       // Asset 생성자 호출
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Thing 인터페이스 구현
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
