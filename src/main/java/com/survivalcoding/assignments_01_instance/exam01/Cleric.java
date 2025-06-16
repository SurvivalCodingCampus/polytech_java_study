package com.survivalcoding.assignments_01_instance.exam01;

public class Cleric {

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    private String name;
    private int hp;
    private int mp;


    private Cleric() {}

    public Cleric(String name) throws RuntimeException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        this.hp = MAX_HP;
        this.mp = MAX_MP;
    }


    public Cleric(String name, int hp) {
        this(name);

        if(hp < 0 || hp > MAX_HP) {
            throw new IllegalArgumentException("HP cannot be less than 0 and greater than or equal to 0");
        }

        this.hp = hp;
    }

    public Cleric(String name, int hp, int mp) {
        this(name);

        if(hp < 0 || mp < 0 || hp > MAX_HP || mp > MAX_MP) {
            throw new IllegalArgumentException("HP or MP cannot be negative");
        }

        this.hp = hp;
        this.mp = mp;
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public void selfAid() {
        int useAmountMp = 5;
        if (mp < useAmountMp) {
            return;
        }
        mp -= useAmountMp;
        hp = MAX_HP;
    }

    public int pray(int sec) {
        if (sec <= 0) {
            return 0;
        }
        if (mp == MAX_MP) {
            return 0;
        }

        int beforeMp = mp;
        int result = sec + getRandomNumber(0, 2);

        if (result + mp > MAX_MP) {
            mp = MAX_MP;
            return mp - beforeMp;
        } else {
            mp += result;
            return result;
        }
    }

    public static int getRandomNumber(final int min, final int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
