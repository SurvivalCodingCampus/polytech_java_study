package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime {

    public PoisonSlime(int hp, String suffix) {
        super(hp, suffix);
    }

    private int count = 5;

    public int getCount() {
        return count;
    }

    @Override
    void attack(Hero hero){
        super.attack(hero);

        if(count != 0){
            System.out.println("추가로, 독 포자를 살포했다!");
            hero.setHp(hero.getHp() -(hero.getHp() /5));
            System.out.println(hero.getHp() /5 +"포인트의 데미지");
            AttackCounte();
        }
    }

    private void AttackCounte() {
        count--;
    }
}
