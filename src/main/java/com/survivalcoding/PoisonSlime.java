package com.survivalcoding;

public class PoisonSlime extends Slime{
    public static final int Max_Hp = 10;
    public static final int Default_Poison_Count = 5;
    private int poisonCount = Default_Poison_Count;

    public PoisonSlime(String suffix, int hp) {
        super(suffix, hp);
    }

    public PoisonSlime(String suffix) {
        super(suffix, Max_Hp);
    }

    public int getPoisonCount() {
        return poisonCount;
    }
    @Override
    void attack(Hero hero) {
        super.attack(hero);
        if(poisonCount > 0)
        {
            System.out.println("추가로, 독 포자를 살포했다!");

            hero.setHp(hero.getHp() * (4/5));

            int reduceHp = hero.getHp() * (1/5);
            System.out.println(reduceHp + "포인트의 데미지");
            poisonCount --;
        }
    }
}
