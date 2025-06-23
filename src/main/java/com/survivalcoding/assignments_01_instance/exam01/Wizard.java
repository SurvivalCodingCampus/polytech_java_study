package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {

    private int hp;
    private int mp = 100;
    private String name;
    private Wand wand;

    void heal(Hero hero)
    {
        int basePoint = 20;//기본 회복 포인트
        //int recovPoint = (int) (basePoint * this.wand.getPower());
        if(mp > 0)
        {
            mp -= 10;
            hero.setHp(hero.getHp() + basePoint);
            System.out.println("힐을 시전했습니다. 대상의 HP : " + hero.getHp());
        }
        else{
            System.out.println("마나가 부족합니다");
        }
    }

    Wizard (int hp, int mp, String name, Wand wand)
    {
        setMp(mp);
        setHp(hp);
        //setName(name);
        //setWand(wand);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp < 0)
        {
            hp = 0;
            System.out.println("마나가 부족합니다");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if(mp < 0)
        {
            throw new IllegalArgumentException("마나가 부족합니다");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        if(name == null)
        {
            throw new IllegalArgumentException("이름은 null이 아니어야 한다.");
        }
        if(name.length() <= 2 )
        {
            throw new IllegalArgumentException("이름이 너무 짧다.");
        }
        this.name = name;
    }*/

    public Wand getWand() {
        return wand;
    }

    /*public void setWand(Wand wand) {
        if(wand == null)
        {
            throw new IllegalArgumentException("지팡이는 null 이다.");
        }
        this.wand = wand;
    }*/

    public void wizardTest()
    {
        System.out.println(hp);
        System.out.println(mp);
        System.out.println(name);
        System.out.println(wand);
    }
}
