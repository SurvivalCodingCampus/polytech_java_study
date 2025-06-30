public class Computer extends TangibleAsset implements Usable, Thing {
    private String maker;
    private double weight;

    public Computer(String name, int price, String color, String maker) {
        super(name, price, color); // 부모 생성자 호출
    }

    public String getMaker() {
        return maker;
    }

    @Override
    public void use() {
        System.out.println(getName() + " 컴퓨터를 켭니다.");
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}