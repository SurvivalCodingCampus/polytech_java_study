package com.survivalcoding.assignments_01_instance.exam01;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    public String name = "Cleric";

    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    public int HP = MAX_HP;
    public int MP = MAX_MP;


        @Test
        public void test() {
            System.out.println("name" + name);
            System.out.println("HP" + HP);
            System.out.println("MP" + MP);

        }



        //selfAid() 사용 시 MP가 충분하다면, MP 5가 소비되고 HP는 최대 HP로 회복되어야 한다.
        //selfAid() 사용 시 MP가 부족하다면, HP가 회복되지 않고 MP도 감소하지 않아야 한다.
        //selfAid() 사용 시 HP가 이미 최대치라면, HP는 변하지 않고 MP만 소비되어야 한다.

    @Test
    public void selfAid()
    {
        MP -=5;
        HP = MAX_HP;

        if(MP>=5)
        {
            MP=-5;
           if(HP==MAX_HP)
           {
               System.out.println("HP는 변하지 않습니다");
           }

            else {
               HP=MAX_HP;
           }

            if(HP==MAX_HP)
            {
                MP=-5;
                System.out.println("HP는 변하지 않습니다");
            }
        }

        else
        {
            System.out.println("HP가 회복되지 않습니다");
            System.out.println("MP가 감소하지 않습니다");
            //감소하지 않아야 한다.

        }
//pray() 사용 시 MP가 회복되어야 하며, 반환 값은 실제로 회복된 MP 양과 일치해야 한다. (MP가 최대치가 아닐 때)
//pray()를 일정 시간 기도했을 때, 회복되는 MP 양이 '기도 시간'에서 '기도 시간 + 2' 사이의 랜덤 범위 내에 있어야 한다.
//pray() 사용 시 MP는 MAX_MP를 초과하여 회복될 수 없으며, MAX_MP까지만 회복되어야 한다.

    }

    @Test
    void RecoveryMP(){
        Cleric c = new Cleric();
        c.MP = 5;
        int before = c.MP;
        int recoverd = c.pray(2);
        assertEquals(c.MP-before,recoverd);
    }

    @Test
    void RangeTest() {
        Cleric c = new Cleric();
        c.MP = 3;
        int recovered = c.pray(3);
        assertTrue(recovered >= 3 && recovered <= 5);
    }

    @Test
    void LimitTest() {
        Cleric c = new Cleric();
        c.MP = 9;
        assertTrue(c.MP <= Cleric.MAX_MP);

    }
}




