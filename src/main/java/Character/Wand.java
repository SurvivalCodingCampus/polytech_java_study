package Character;

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
        if (power < 0.5) {
            throw new IllegalArgumentException("파워가 0.5 이상이어야 함");
        }
        if (power > 100.0) {
            throw new IllegalArgumentException("파워가 100.0 이하여야 함");
        }
        this.power = power;
    }
}
