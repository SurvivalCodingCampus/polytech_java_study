package com.survivalcoding;

public class GreatWizard extends Wizard {

    //속성 작성
    // 생성자 : mp를 150으로 증가
    public GreatWizard(String name, int hp, Wand wand) {
        super(name, hp, 150, wand);
    }

    //메서드 작성

    @Override
    public void heal(Hero hero) {
        // 문제 5) void heal(Hero hero) 재정의 :  hp를 25 회복시키고 자신의 mp를 5 소모
        // 마나가 부족하면 부족 메세지 출력
        if (getMp() < 5) {
            System.out.println("마나가 부족합니다");
            return;
        }
        hero.setHp(hero.getHp() + 25);
        this.setMp(this.getMp() - 5);

    }

    public void superHeal(Hero hero) {
        // 마나가 부족하면 부족 메세지 출력
        if (getMp() < 50) {
            System.out.println("마나가 부족합니다");
            return;
        }
        hero.setHp(100);
        this.setMp(this.getMp() - 50);
        //힐 성공 시 ,
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }


}
