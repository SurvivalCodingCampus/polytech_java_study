package com.survivalcoding;

public class PoisonSlime extends Slime {
    public static final int MAX_HP = 10;
    public static final int DEFAULT_POISON_COUNT = 5;

    private int poisonCount = DEFAULT_POISON_COUNT;

    public PoisonSlime(String prefix, int hp) {
        super(prefix, hp);
    }

    public PoisonSlime(String prefix) {
        super(prefix, MAX_HP);
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero); // Slime 의 공격

        if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");

            int damage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + "포인트의 데미지");
            poisonCount--;
        }
    }

}

