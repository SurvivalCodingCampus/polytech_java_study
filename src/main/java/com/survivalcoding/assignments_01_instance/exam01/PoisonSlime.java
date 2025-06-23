package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime{

    private int pointCount = 5;

    protected PoisonSlime(String suffix, int hp, int pointCount) {
        super(suffix, hp);
        this.pointCount = pointCount;
    } // 테스트용 생성자이다.

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    public PoisonSlime(String suffix, int hp) {
        super(suffix, hp);
    }


    @Override
    public void attack(LivingEntity livingEntity){
        if(pointCount <= 0){
            super.attack(livingEntity);
            return;
        }
        pointCount--;
        int amount = livingEntity.getHp() / 5;
        super.attack(livingEntity);
        System.out.println("추가로 독 포자를 살포했다!");
        System.out.println(amount + "포인트의 추가 데미지");
        livingEntity.takeDamage(amount);
    }

}
