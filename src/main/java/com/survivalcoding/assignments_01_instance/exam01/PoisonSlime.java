package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime{

    int poisonCount = 5;

    public PoisonSlime (String suffix) {
        super(suffix);
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

       if(poisonCount > 0) {  //if(poisonCount != 0)
           System.out.println("추가로, 독 포자를 살포했다!");

           int poisonDamage = hero.getHp() / 5;

           hero.setHp(hero.getHp() - poisonDamage);
           System.out.println(poisonDamage + " 포인트의 데미지");

           poisonCount--;
       }
    }
}
