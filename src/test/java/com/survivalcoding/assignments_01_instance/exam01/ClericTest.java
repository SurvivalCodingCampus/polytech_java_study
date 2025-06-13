package com.survivalcoding.assignments_01_instance.exam01;


import org.junit.jupiter.api.Test;

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


    }


    }



