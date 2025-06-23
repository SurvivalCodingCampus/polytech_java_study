package practice250610;

public class Hero {
    final private String name;
    private int hp;
    final private int maxHp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public Hero(String name) {
        this(name, 100);
    }

    public Hero(int hp) {
        this("hero", hp);
    }

    public Hero() {
        this("hero", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
