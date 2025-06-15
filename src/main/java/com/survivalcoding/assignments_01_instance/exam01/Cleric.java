package com.survivalcoding.assignments_01_instance.exam01;

public class Cleric {

    public String name = "Cleric";

    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    public int HP = MAX_HP;
    public int MP = MAX_MP;

    public void selfAid() {
        MP -= 5;
        HP = MAX_HP;
    }

    // 회복량은 기도한 시간에 랜덤하게 0~2포인트의 보정을 한 양 (3초 기도하면 회복량은 3-5포인트)
    //단 최대MP보다 더 회복하는 것은 불가능
    public int pray(int sec) {
        if (MP == MAX_MP) {
            return 0;
        }

        int bonus = 0;
        int beforeMP = MP;
        int recover = 0;

        if (sec > 0 && sec < 3) {
            bonus = (int)Math.random() * 3;
            recover = sec + bonus;
        } else if (sec == 3) {
            bonus = (int)Math.random() * 3;
            recover = 3 + bonus;
        }

        MP += recover;

        if(MP>MAX_MP)
        {
            MP = MAX_MP;
        }

        return MP - beforeMP;

    }
}


