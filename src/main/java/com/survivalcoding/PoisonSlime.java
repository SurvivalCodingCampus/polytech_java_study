package com.survivalcoding;

public class PoisonSlime extends Slime{
    private boolean isPoison;
    String name;
    int poisonCount = 5;


    PoisonSlime(String suffix, int hp) {
        super(suffix, hp);
    } //부모 클래스 생성자


    public int getPoisonCount() {
        return poisonCount;
    }

    public void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack(Hero hero){
        super.attack(hero);

        if(isPoison && poisonCount > 0){
            System.out.println("추가로, 독 포자를 살포했다링");

            hero.setHp(hero.getHp() - (hero.getHp()/5));
            System.out.println((hero.getHp()/5) + " 포인트의 데미지");
            poisonCount--;
        }
    }
}
