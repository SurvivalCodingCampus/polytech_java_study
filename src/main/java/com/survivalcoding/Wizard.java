package com.survivalcoding;

public class Wizard { // 클래스

    private int hp;
    private int mp;
    private String name;
    private Wand wand;


    public Wizard(String name, int hp, int mp) { // 생성자
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.wand = getWand();
    }

    // HP 관련 get, set
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            // setter 메소드 안에서 값의 타당성 검사
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }

    // MP 관련 get, set
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            // setter 메소드 안에서 값의 타당성 검사
            throw new IllegalArgumentException("mp는 음수가 될 수 없다.");
        }
        this.mp = mp;
    }

    // NAME 관련 get, set
    public String getName() {
        return name; // 외부에서 Hero.name 메소드를 알 수 있게 해줌
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        this.name = name; // 새로운 값을 변경 가능하게 해줌
    }

    // WAND 관련 get, set
    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null이 될 수 없다.");
        }

        this.wand = wand;
    }

    public void heal(Hero hero) {
        int basePoint = 10; // 기본 회복 포인트
        int recoverPoint = (int) (basePoint * this.wand.getPower()); // 지팡이에 의한 증폭
        //private인 power의 값을 읽기 위해 설정 되어 있는 getPower()로 접근
        hero.setHp(hero.getHp() + recoverPoint); // 용사의 HP를 회복

    }


}
