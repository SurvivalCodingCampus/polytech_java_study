package inheritance;

public class Slime {
    private final String suffix;
    private int hp;

    // 생성자
    public Slime (String suffix, int hp) {
        this.suffix = suffix;
        this.hp = hp;   // 기본 HP 값 설정
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }
}
