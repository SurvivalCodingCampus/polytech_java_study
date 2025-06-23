package com.survivalcoding;

public class PosionSlime extends Slime{
    private static int posionCount = 5;

    public PosionSlime(String suffix) {
        super(suffix);
    }

    @Override
    void attack(Hero hero) {
        super.attack(hero);
        if(posionCount > 0)
        {
            System.out.println("추가로, 독 포자를 살포했다!");

            hero.setHp(hero.getHp() * (4/5));

            int reduceHp = hero.getHp() * (1/5);
            System.out.println(reduceHp + "포인트의 데미지");
            posionCount --;
        }
    }
}
