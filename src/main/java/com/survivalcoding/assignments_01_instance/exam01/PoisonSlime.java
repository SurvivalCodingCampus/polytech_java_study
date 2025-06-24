package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime {
    public static final int MAX_Hp = 5;
    public static final int DEFAULT_POISONCOUNT = 5;
    private int poisonCount = 5;

    public PoisonSlime(int hp, String suffix) {
        super(hp, suffix);
    }

    public PoisonSlime(String suffix) {
        super(MAX_Hp, suffix);
    }


    public int getPoisonCount() {
        return poisonCount;
    }

    private void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);  //슬라임의 공격

        if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다 !");

            int damage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + " 포인트의 데미지");
            poisonCount--;  // poisoncount 1 감소

        }
    }

    public static void main(String[] args) {
        PoisonSlime poisonSlime = new PoisonSlime("A");
        Hero hero = new Hero("용사", 50);

        poisonSlime.attack(hero);

    }
}
