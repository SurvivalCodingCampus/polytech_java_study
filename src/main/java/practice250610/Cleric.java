package practice250610;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int maxHp = 50;
    final int maxMp = 10;

    void selfAid() {
        if(mp >= 5) {
            if(hp == maxHp) {
                mp -= 5;
            }
            else {
                mp -= 5;
                hp = maxHp;
            }
        }
    }

    int pray(int sec) {
        if((sec <= 0) || (mp == maxMp)) return 0;
        Random rand = new Random();
        int randInt = rand.nextInt(3) + sec;
        mp += randInt;
        if(mp > maxMp) {
            randInt = mp - maxMp;
            mp = maxMp;
        }
        return randInt;
    }
}
