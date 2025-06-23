package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime {

    private int poisonCount = 5;

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    private void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }

    @Override
    void attack(Hero hero) {
        super.attack(hero);

        if (getPoisonCount() != 0) {
            System.out.println("추가로, 독 포자를 살포했다 !");

            int minushp = hero.getHp() - hero.getHp() / 5;
            hero.setHp(minushp);
            System.out.println(minushp + " 포인트의 데미지");
            setPoisonCount(getPoisonCount() - 1);  // poisoncount 1 감소

        }
    }

    public static void main(String[] args) {
        PoisonSlime poisonSlime = new PoisonSlime("A");
        Hero hero = new Hero("용사", 50);

        poisonSlime.attack(hero);

    }
}
