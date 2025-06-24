public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("마법사나 지팡이의 이름은 null일 수 없고, 반드시 3글자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("지팡이의 마력(" + power + ")은 0.5 이상 100.0 이하여야 합니다.");
        }
        this.power = power;
    }
}
