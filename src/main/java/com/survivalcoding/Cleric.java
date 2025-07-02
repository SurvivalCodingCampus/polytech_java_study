package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name = "Strong Cleric";
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    private int currentHp; // 초기 값으로 할당
    private int currentMp; // 초기 값으로 할당
    private static final Random rand = new Random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Name cannot be null");
        this.name = name;
    }

    public int getCurrentMp() {
        return currentMp;
    }

    public void setCurrentMp(int currentMp) {
        if (currentMp < 0)
            throw new IllegalArgumentException("Current mp cannot be negative");
        if (currentMp > MAX_MP)
            throw new IllegalArgumentException("Current mp cannot be greater than max mp");
        this.currentMp = currentMp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        if (currentHp < 0)
            throw new IllegalArgumentException("Current hp cannot be negative");
        if (currentHp > MAX_HP)
            throw new IllegalArgumentException("Current hp cannot be greater than max hp");

        this.currentHp = currentHp;
    }

    public Cleric(String name) {
        this.name = name;
        this.currentHp = MAX_HP;
        this.currentMp = MAX_MP;
    }

    public Cleric(String name, int hp) {
        this(name);
        this.currentHp = hp;
    }

    public Cleric(String name, int hp, int mp) {
        this(name, hp);
        this.currentMp = mp;
    }

    public void selfAid() {
        if (currentMp < 5) {
            // 스킬 못 쓴다고 하기
            return;
        }

        this.currentMp -= 5;
        this.currentHp = MAX_HP;
    }

    public int pray(int time) {
        if (time < 0) {
            // 잘못된 time 값
            return 0;
        }

        int randomUpMp = rand.nextInt(3) + time;
        int tempMp = this.currentMp;

        currentMp += randomUpMp;

        if (currentMp > MAX_MP) {
            currentMp = MAX_MP;
            return MAX_MP - tempMp;
        } else
            return randomUpMp;
    }
}
