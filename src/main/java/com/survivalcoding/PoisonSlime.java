package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount;

    public PoisonSlime(String name) {
        super(name);
        this.poisonCount = 5;
    }

    public int getPoisonCount() {
        return this.poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (poisonCount <= 0) {
            throw new IllegalArgumentException("카운트 전부 소진");
        } else if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!!!!!");
            int damage = (int) (Hero.initialHP * 0.2);
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + "포인트의 데미지");
            poisonCount--;
        }
    }
}
