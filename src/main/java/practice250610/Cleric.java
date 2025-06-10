package practice250610;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int maxHp = 50;
    final int maxMp = 10;

    void selfAid() {
        if((hp != maxHp) && (mp >= 5)) {
            mp -= 5;
            hp = maxHp;
        }
    }
}
