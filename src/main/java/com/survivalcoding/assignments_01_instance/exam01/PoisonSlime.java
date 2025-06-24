package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime{

    private int poisonCount = 5;

    public PoisonSlime(String suffix, int hp, int poisonCount) {
        super(suffix, hp);
        this.poisonCount = Math.max(0, poisonCount);
    }

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    public PoisonSlime(String suffix, int hp) {
        super(suffix, hp);
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    @Override
    public void attack(LivingEntity livingEntity){
        if(poisonCount <= 0){
            super.attack(livingEntity);
            return;
        }
        poisonCount--;
        int amount = livingEntity.getHp() / 5;
        super.attack(livingEntity);
        System.out.println("추가로 독 포자를 살포했다!");
        System.out.println(amount + "포인트의 추가 데미지");
        livingEntity.takeDamage(amount);
    }

}
