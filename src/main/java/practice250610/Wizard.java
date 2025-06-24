package practice250610;

public class Wizard {
    private int hp;
    private int mp;
    final private int maxHp;
    final private int maxMp;
    final private int healPoint;
    final private int mpPoint;

    private String name;
    protected Wand wand;

    //mp = 100
    public Wizard(String name, int hp, int mp) {
        setName(name);
        setHp(hp);
        setMp(mp);
        maxHp = getHp();
        maxMp = getMp();
        healPoint = 20;
        mpPoint = 10;
    }

    public Wizard(String name) {
        this(name, 100, 100);
    }

    public Wizard() {
        this("wizard", 100, 100);
    }

    public void heal(Hero hero) {
        if (getMp() < mpPoint) {
            System.out.println("마나가 부족합니다");
        } else {
            hero.setHp(hero.getHp() + healPoint);
            setMp(getMp() - mpPoint);
            System.out.println("힐을 시전했습니다. " + hero.getName() + " HP: " + hero.getHp());
        }
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이가 null이 아니어야 함");
        }
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) setHp(0);
        else this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) throw new IllegalArgumentException("mp가 0 이상이어야 함");
        else this.mp = mp;
    }

    public int getMaxMp() {
        return maxMp;
    }

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
        this.name = name;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public int getMpPoint() {
        return mpPoint;
    }
}
