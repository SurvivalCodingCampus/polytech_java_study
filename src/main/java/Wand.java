public class Wand {
    String name; // 지팡이 이름
    double power; // 지팡이 마력

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException ("마법사나 지팡이의 이름은 null일 수 없고, 반드시 3문장 이상여야 한다.");
        }
        this.name = name;
    }

    public double getPower()
    {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException ("지팡이의 마력은 0.5이상 100.0이하여야 한다.");
        }
        this.power = power;
    }

}
