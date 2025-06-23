package com.survivalcoding;

public class PoisonSlime extends Slime{
    private int poisonCount = 5;


    public PoisonSlime(String suffix) {
        super(suffix, 100);
    } //부모 클래스 생성자


    public int getPoisonCount() {
        return poisonCount;
    }

    public void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }


    @Override
    public void attack(Hero hero){
        super.attack(hero);

        if(poisonCount > 0){
            System.out.println("추가로, 독 포자를 살포했다링");

            hero.setHp(hero.getHp() - (hero.getHp()/5));
            System.out.println((hero.getHp()/5) + " 포인트의 데미지");
            poisonCount--;
        }
    }
}
