package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Cleric {
    //이름 최대 MP, HP
    String name;
    int HP;
    final int MAX_HP = 50;
    int MP;
    final int MAX_MP = 10;

    //셀프 에이드 MP 5소모 HP 최대로 회복 인수가 없고 리턴값도 없음
    public void selfAid() {
        if (this.MP < 5) {
            return;
        }
        this.MP -= 5;
        this.HP = MAX_HP;
    }

    //기도하기로 MP 회복
    //회복량은 기도한 시간(초)에 랜덤하게 0~2포인트 보정을 한 양(3초 기도하면 회복량은 3~5포인트) 최대 MP 초과 회복 불가
    //인수에 "기도할 시간(초)"를 지정할 수 있고, 리턴 값은 "실제로 회복된 MP양" 반환
    public int pray(int sec) {

        Random rand=new Random();
        int recovery=sec+rand.nextInt(3);
        MP+=recovery;

        if (MP > MAX_MP) {
            MP = MAX_MP;
        }
        return recovery;
    }
}
