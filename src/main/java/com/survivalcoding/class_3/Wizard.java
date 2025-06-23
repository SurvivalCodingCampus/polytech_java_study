package com.survivalcoding.class_3;

/******************************************
 * 수정일 : 250623
 * 수정사항
 * 1 : hp, mp 초기값 100으로 설정
 * 2 : heal메서드 수정
 *      i) hp를 20 회복시키고 자신의 mp를 10 소모
 *      ii) mp가 부족하면 "마나가 부족합니다" 출력
 *      iii) 힐을 성공하면 "힐을 시전했습니다.
 *           대상 HP: XX" 출력
 ******************************************/


public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    // 초기값 수정
    public Wizard() {
        this(100, 100, "홍길동");
    }

    public Wizard(int hp, int mp, String name) {
        this.setHp(hp);
        this.setMp(mp);
        this.setName(name);
    }

    public Wizard(int hp, int mp, String name, Wand wand) {
        this.setHp(hp);
        this.setMp(mp);
        this.setName(name);
        this.setWand(wand);
    }

    public void heal(Hero hero) {
//        int basePoint = 10;
//        if (this.wand == null) {
//            throw new IllegalArgumentException("지팡이가 설정되지 않았습니다");
//        }
//        int recovPoint = (int) (basePoint * this.wand.getPower()); // 지팡이에 의한 증폭
//
//        hero.setHp((hero.getHp()) + recovPoint);   // 용사의 HP를 회복
        if ((this.mp - 10) >= 0) {
            hero.setHp(hero.getHp() + 20);
            this.mp -= 10;
            System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }

    // getter
    public Wand getWand() {
        return wand;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public String getName() {
        return name;
    }

    // setter
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null이 아니어야 함");
        }
        this.wand = wand;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 함");
        }
        this.mp = mp;
    }

    public void setName(String name) {
        this.name = name;
    }
}
