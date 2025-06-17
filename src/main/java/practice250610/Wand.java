package practice250610;

public class Wand {
    private String name;    // 지팡이의 이름
    protected double power;   // 지팡이의 마력

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 3 문자 이상이어야 함");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
