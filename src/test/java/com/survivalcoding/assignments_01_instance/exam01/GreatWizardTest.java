package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.assignments_01_instance.exam01.mock.TestHealableEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatWizardTest {


    @Test
    @DisplayName("Great 마법사 생성시 기본 mp는 150이다")
    void createWizard_1() {
        //given
        Wizard wizard = createGreateWizard();
        //when //then
        assertEquals(150, wizard.getMp());
    }

    @Test
    @DisplayName("Great 마법사의 heal 메서드 사용시 자신의 mp 5이 소모 되고 상대 hp 25이 회복된다.")
    void heal() {
        //given
        GreatWizard greateWizard = createGreateWizard();
        int beforeMp = greateWizard.getMp();
        int hp = 50;
        TestHealableEntity testHealableEntity = new TestHealableEntity(hp);

        //when
        greateWizard.heal(testHealableEntity);

        //then
        assertEquals(hp + 25, testHealableEntity.getHp());
        assertEquals(beforeMp - 5, greateWizard.getMp());
    }

    @Test
    @DisplayName("Great 마법사의 heal 메서드 사용 시 mp가 부족한 경우 사용되지 않는다.")
    void heal_1() {
        //given
        GreatWizard greateWizard = createGreateWizard();
        greateWizard.setMp(0);
        int hp = 100;
        TestHealableEntity testHealableEntity = new TestHealableEntity(hp);
        //when
        greateWizard.heal(testHealableEntity);

        //then
        assertEquals(hp, testHealableEntity.getHp());
    }
    @Test
    @DisplayName("Great 마법사의 heal 메서드 사용시 자신의 mp 50 소모 되고 상대 hp 전체가 회복된다.")
    void superHeal() {
        //given
        GreatWizard greateWizard = createGreateWizard();
        int beforeMp = greateWizard.getMp();
        int hp = 50;
        TestHealableEntity testHealableEntity = new TestHealableEntity(hp);

        //when
        greateWizard.superHeal(testHealableEntity);

        //then
        assertEquals(testHealableEntity.getMaxHp(), testHealableEntity.getHp());
        assertEquals(beforeMp - 50, greateWizard.getMp());
    }

    @Test
    @DisplayName("Great 마법사의 heal 메서드 사용 시 mp가 부족한 경우 사용되지 않는다.")
    void superHeal_1() {
        //given
        GreatWizard greateWizard = createGreateWizard();
        greateWizard.setMp(0);
        int hp = 100;
        TestHealableEntity testHealableEntity = new TestHealableEntity(hp);
        //when
        greateWizard.superHeal(testHealableEntity);

        //then
        assertEquals(hp, testHealableEntity.getHp());
    }



    private static GreatWizard createGreateWizard() {
        String wandName = "myPet";
        double power = 1f;
        Wand wand = new Wand();
        wand.setPower(power);
        wand.setName(wandName);
        GreatWizard greatWizard = new GreatWizard();
        greatWizard.setWand(wand);
        return greatWizard;
    }

}