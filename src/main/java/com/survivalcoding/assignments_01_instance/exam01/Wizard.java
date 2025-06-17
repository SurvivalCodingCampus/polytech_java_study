package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {

    int hp;
    int mp;
    String name;
    Wand wand;

    void heal(Hero hero)
    {
        int basePoint = 10;//기본 회복 포인트
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

    Wizard (int hp, int mp, String name, Wand wand)
    {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp < 0)
        {
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if(mp < 0)
        {
            throw new IllegalArgumentException("mp가 마이너스다.");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
        {
            throw new IllegalArgumentException("이름은 null이 아니어야 한다.");
        }
        if(name.length() <= 2 )
        {
            throw new IllegalArgumentException("이름이 너무 짧다.");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if(wand == null)
        {
            throw new IllegalArgumentException("지팡이는 null 이다.");
        }
        this.wand = wand;
    }

    public void wizardTest()
    {
        System.out.println(hp);
        System.out.println(mp);
        System.out.println(name);
        System.out.println(wand);
    }
}
