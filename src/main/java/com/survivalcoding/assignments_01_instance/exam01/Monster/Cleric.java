package com.survivalcoding.assignments_01_instance.exam01.Monster;

import java.util.Random;

public class Cleric {
    //이름 최대 MP, HP
    String name;
    int HP;
    static final int MAX_HP = 50;
    int MP;
    static final int MAX_MP = 10;

        //이름, HP, MP 모두 지정
public Cleric(String name, int HP, int MP){
            this.name=name;
            this.HP=HP;
            this.MP=MP;
        }
//이름, HP만 지정 MP는 최대 MP값으로 초기화
    public Cleric(String name, int HP){
            this(name, HP, MAX_MP);
        }
        //이름만 지정 HP와 MP는 최댓값으로 초기화
    public Cleric(String name){
            this(name, MAX_HP, MAX_MP);
        }

    public static void main(String[] args){
        Cleric cleric1 = new Cleric("아서스", 40, 5);
        // 이름을 지정하지 않는 경우에는 인스턴스화 할 수 없음 (이름이 없는 성직자는 존재할 수 없음)
        //생성자는 가능한 중복되는 코드가 없도록 작성
    }
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
        int result=0;
        Random rand=new Random();

        int recovery=sec+rand.nextInt(3);
        int availableRecovery = MAX_MP - MP;

        result=Math.min(recovery, availableRecovery);
        MP+=result;

        if (MP > MAX_MP) {
            MP = MAX_MP;
        }
        return result;
    }
}
