package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.assignments_01_instance.exam01.mock.TestLivingEntity;
import com.survivalcoding.assignments_01_instance.exam01.mock.TestPoisonSlimeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PoisonSlimeTest {


    @Test
    @DisplayName("독 슬라임이 지정한 suffix 로 생성된다.")
    void createPoisonSlime() {
        //given
        String suffix = "A";
        //when
        PoisonSlime poisonSlime = new PoisonSlime(suffix);
        //then
        Assertions.assertEquals(suffix, poisonSlime.getSuffix());
    }

    @Test
    @DisplayName("지정한 Suffix가 없거나 비어있는 경우 예외가 발생한다")
    void createPoisonSlime_1() {
        //given //when //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new PoisonSlime(null);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new PoisonSlime("");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new PoisonSlime(" ");
        });
    }

    @Test
    @DisplayName("독이 있는 상태에서 상대방을 공격 시 10 + hp 5 /1 이 감소한다. ")
    void attack() {
        //given
        PoisonSlime poisonSlime = new PoisonSlime("A");
        int hp = 100;
        TestLivingEntity testLivingEntity = new TestLivingEntity(hp);

        //when
        poisonSlime.attack(testLivingEntity);

        //then
        Assertions.assertEquals(hp - (10 + hp / 5), testLivingEntity.getHp());
    }

    @Test
    @DisplayName("독이 없는 상태에서 상대방을 공격 시 10이 감소한다. ")
    void attack_2() {
        //given
        PoisonSlime poisonSlime = TestPoisonSlimeFactory.createZeroCountSlime();
        int hp = 100;
        TestLivingEntity testLivingEntity = new TestLivingEntity(hp);

        //when
        poisonSlime.attack(testLivingEntity);

        //then
        Assertions.assertEquals(hp - 10, testLivingEntity.getHp());
    }

}