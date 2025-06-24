package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    public static final int maxHp = 100;
    public static final int maxMp = 100;
    private String name;
    private Wand wand;

    // 위자드의 이름만 지정했을 땐, Wand의 기본 생성자로 Wand의 이름은 "기본지팡이"
    // 초보 마법사이므로, hp와 mp는 50부터 시작
    public Wizard(String name) {
        this(name, new Wand(), 50, 50);
    }

    // 위자드의 이름을 명시하고 wand를 미리 지급받은 경우
    // hp와 mp는 100으로 설정
    public Wizard(String name, Wand wand) {
        this(name, wand, Wizard.maxHp, Wizard.maxMp);
    }

    // 이 생성자가 바로 호출되는 경우는 GreateWizard에서 super로 호출할 경우
    public Wizard(String name, Wand wand, int hp, int mp) {
        // setter에서 타당성 검사를 하기 위해 setter를 호출해 초기화
        this.setName(name);
        this.setWand(wand);
        this.setHp(hp);
        this.setMp(mp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0이상 이어야 한다");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("캐릭터 생성 시 닉네임은 null일 수 없음");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null일 수 없다");
        }
        this.wand = wand;
    }

    public void heal(Hero hero) {
        if (this.getMp() < 10) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(hero.getHp() + 20);
        this.setMp(this.getMp() - 10);
        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }
}