package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    int hp;
    int mp;
    String name;
    Wand wand;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void heal(Hero hero){
        int basePoint=10;
        int recovPoint=(int) (basePoint*this.wand.power);
        hero.setHp(hero.getHp()+recovPoint);
    }
}
//setter 메소드에 대해 인수의 타당성 검사
//부정한 값이 설정 될 경우 “throw new IllegalArgumentException(“메세지");” 프로그램을 중단
//마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
//지팡이의 마력은 0.5 이상 100.0 이하여야 한다.
//마법사의 지팡이는 null 일 수 없다.
//마법사의 MP는 0 이상이어야 한다.
//HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.
