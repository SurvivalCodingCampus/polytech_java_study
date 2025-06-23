package com.survivalcoding;

public class PoisonSlime extends Slime {
    int poisonCount;

    PoisonSlime(String name) {
        super(name);
        setPoisonCount(5);
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    private void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }

    public void attack(Hero hero) {
        super.attack(hero);

        if (getPoisonCount() >= 1) {
            System.out.println("추가로 독 포자를 살포했다!");

            System.out.println((hero.getHp() / 5) + " 포인트 대미지");
            hero.setHp(hero.getHp() - (hero.getHp() / 5));
            setPoisonCount(getPoisonCount() - 1);
        }
    }
}
