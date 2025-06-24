package Asset;

public abstract class Asset {
    private String name;
    private int price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (this.name == null) {
            throw new IllegalArgumentException("이름은 1문자 이상이어야 한다");
        }
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        if (this.price < 0) {
            throw new IllegalArgumentException("값은 0원 이상이어야 한다");
        }
        this.price = price;
    }
}
