package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlimeTest {

    @Test
    @DisplayName("일반 슬라임은 공격시 Hero의 Hp를 10 감소시킴")
    void NormalSlimeAttack() {
        Hero hero = new Hero();
        hero.setHp(50);

        Slime slime = new Slime("A");
        slime.attack(hero);

        assertEquals(40, hero.getHp());
    }



    }