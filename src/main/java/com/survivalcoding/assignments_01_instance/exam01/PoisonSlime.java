package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime{

    private int pointCount = 5;

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    public PoisonSlime(String suffix, int hp) {
        super(suffix, hp);
    }

    @Override
    public void attack(LivingEntity livingEntity){
        super.attack(livingEntity);
        if(pointCount <= 0){
            return;
        }
        pointCount--;
        System.out.println("추가로 독 포자를 살포했다!");
        int amount = livingEntity.getHp() / 5;
        System.out.println(amount + "포인트의 데미지");
        livingEntity.takeDamage(amount);
    }

}
