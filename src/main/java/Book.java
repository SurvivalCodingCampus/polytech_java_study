public class Book extends TangibleAsset implements Usable,Thing {
    private String isbn;
    private double weight;

    public Book (String name, int price, String color, String makerName) {
        super(name, price, color); // 부모 생성자 호출
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void use() {
        System.out.println(getName() + " 책을 폅니다");
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

