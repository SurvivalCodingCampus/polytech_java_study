package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.Cleric;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("selfAid() 사용 시 MP가 충분하다면, MP 5가 소비되고 HP는 최대 HP로 회복되어야 한다.")
    //selfAid() 메소드 추가 인수가 없고, 리턴 값도 없다.
    void selfAid1() {
        // given
        final Cleric cleric = new Cleric();
        cleric.hp = 5;

        // when
        cleric.selfAid();

        // then
        assertEquals(50, cleric.hp);
    }

    @Test
    @DisplayName("selfAid() 사용 시 MP가 부족하다면, HP가 회복되지 않고 MP도 감소하지 않아야 한다.")
    void selfAid2() {
        // given
        final Cleric cleric = new Cleric();
        cleric.hp = 5;
        cleric.mp = 4;

        // when
        cleric.selfAid();

        // then
        assertEquals(5, cleric.hp);
    }

    @Test
    @DisplayName("selfAid() 사용 시 HP가 이미 최대치라면, HP는 변하지 않고 MP만 소비되어야 한다.")
    void selfAid3() {
        // given
        final Cleric cleric = new Cleric();
        cleric.hp = 50;
        cleric.mp = 6;

        // when
        cleric.selfAid();

        // then
        assertEquals(50, cleric.hp);
        assertEquals(1, cleric.mp);

    }


    @Test
    @DisplayName("pray() 사용 시 MP가 회복되어야 하며, 반환 값은 실제로 회복된 MP 양과 일치해야 한다.")
    void pray1() {

        // given
        final Cleric cleric = new Cleric();
        cleric.mp = 2;

        // when
        cleric.pray(2);

        // then
        assertEquals(4, cleric.mp);

    }

    @Test
    @DisplayName("pray()를 일정 시간 기도했을 때, 회복되는 MP 양이 '기도 시간'에서 '기도 시간 + 2' 사이의 랜덤 범위 내에 있어야 한다.")
    void pray2() {

        // given
        final Cleric cleric = new Cleric();
        cleric.mp = 2;

        // when
        cleric.pray(3);

        // then
        assertEquals(7, cleric.mp);

    }

    @Test
    @DisplayName("pray() 사용 시 MP는 Max_MP를 초과하여 회복될 수 없으며, Max_MP 까지만 회복되어야 한다.")
    void pray3() {

        // given
        final Cleric cleric = new Cleric();
        cleric.mp = 8;

        // when
        cleric.pray(3);

        // then
        assertEquals(10, cleric.mp);

    }

    @Test
    @DisplayName("pray() 사용 시 기도 시간(prayTimeSec)이 0이거나 음수일 경우, MP는 회복되지 않고 0을 반환해야 한다.")
    void pray4() {

        // given
        final Cleric cleric = new Cleric();
        cleric.mp = 2;

        // when
        cleric.pray(0);

        // then
        assertEquals(2, cleric.mp);

    }

    @Test
    @DisplayName("pray() 사용 시 MP가 이미 Max_MP 라면, MP는 변하지 않고 0을 반환해야 한다.")
    void pray5() {

        // given
        final Cleric cleric = new Cleric();
        cleric.mp = 10;

        // when
        cleric.pray(3);

        // then
        assertEquals(10, cleric.mp);

    }

    public static void main(String[] args) {
        // 이름, HP, MP 모두 지정
        Cleric c1 = new Cleric("아서스", 40, 5);
        System.out.println("c1 -> 이름: " + c1.name + ", HP: " + c1.hp + ", MP: " + c1.mp);

        // 이름과 HP만 지정 (MP는 최대 MP로 초기화)
        Cleric c2 = new Cleric("아서스", 35);
        System.out.println("c2 -> 이름: " + c2.name + ", HP: " + c2.hp + ", MP: " + c2.mp);

        // 이름만 지정 (HP, MP 모두 최대값으로 초기화)
        Cleric c3 = new Cleric("아서스");
        System.out.println("c3 -> 이름: " + c3.name + ", HP: " + c3.hp + ", MP: " + c3.mp);

        Cleric c4 = new Cleric();
        System.out.println("c4 -> 이름: " + c4.name + ", HP: " + c4.hp + ", MP: " + c4.mp);

    }



}