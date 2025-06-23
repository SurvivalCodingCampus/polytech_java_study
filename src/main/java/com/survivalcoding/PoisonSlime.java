package com.survivalcoding;

public class PoisonSlime extends Slime { // Slime 상속

    private String name;
    private int poisonCount = 5; // 할 필요 없나?


    public PoisonSlime(String name) {//생성자 생성
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoisonCount() {

        return poisonCount;
    }

    @Override
    public void attack(Hero hero) { // 독 공격 매서드 작성

        super.attack(hero);// 문제3_4.a ['보통 슬라임과 같은 공격']

        if (poisonCount != 0) { // 문제3_b ['count가 0 아닐 경우']
            System.out.println("추가로, 독 포자를 살포했다!");
            int damage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + " 포인트의 데미지");

            poisonCount--;
        }

    }

}
