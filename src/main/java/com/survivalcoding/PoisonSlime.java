package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount;

    public PoisonSlime(String suffix) {
        super(suffix);

    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (poisonCount != 0) {


            System.out.println("추가로, 독 포자를 살포했다.");
            int damage = getHp() / 5;
            System.out.println(damage + "이 데미지");
            hero.setHp(hero.getHp() - damage);
            //원래 있던 데미지만큼 빼라.
            poisonCount = setHp() - damage;


        }


    }

    public int setHp() {
        return 0;
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    public void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }
}


