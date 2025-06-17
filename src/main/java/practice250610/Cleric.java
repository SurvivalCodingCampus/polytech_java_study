package practice250610;

import java.util.Random;

public class Cleric {
    String name;
    int hp;
    int mp;
    static final int maxHp = 50;
    static final int maxMp = 10;

    Cleric(String name) {
        this(name, maxHp);
    }

    Cleric(String name, int hp) {
        this(name, hp, maxMp);
    }

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    void selfAid() {
        if (mp >= 5) {
            if (hp == maxHp) {
                mp -= 5;
            } else {
                mp -= 5;
                hp = maxHp;
            }
        }
    }

    int pray(int sec) {
        if ((sec <= 0) || (mp == maxMp)) return 0;
        Random rand = new Random();
        int randInt = rand.nextInt(3) + sec;
        mp += randInt;
        if (mp > maxMp) {
            randInt = mp - maxMp;
            mp = maxMp;
        }
        return randInt;
    }
}
