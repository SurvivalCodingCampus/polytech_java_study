public class Wizard {

    protected int hp = 50;
    protected int mp = 50;

    public static final int MAX_HP = 100;
    public static final int MAX_MP = 100;

    private Wand wand;

    public Wand getWand() {
        return wand;
    }

    public void heal (Wizard wizard) {
        if (this.mp < 10) {
            throw new IllegalArgumentException("마나가 부족합니다.");
        }

        wizard.setHp(wizard.getHp() + 20);
        this.mp -= 10;

        System.out.println("힐을 시전했습니다. 대상 HP: " + wizard.getHp());
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null 일 수 없다.");
        }
        this.wand = wand;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0 || mp > MAX_MP) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상 " + MAX_MP + "이여야 한다.");
        }
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);  // 음수일 경우 0으로 처리
    }
}


