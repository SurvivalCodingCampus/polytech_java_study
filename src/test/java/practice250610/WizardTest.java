package practice250610;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    @DisplayName("지팡이의 파워에 따라 회복 포인트를 증가시킨다")
    void WizardHeal() {
        Wand wand = new Wand();
        Wizard wizard = new Wizard();
        Hero hero = new Hero();

        wand.setPower(10.0);
        wizard.setWand(wand);

        hero.setHp(10);

        wizard.heal(hero);
        assertEquals(110, hero.getHp());
    }

    @Test
    @DisplayName("지팡이가 null이라면 프로그램 종료")
    void setWandNull() {
        Wizard wizard = new Wizard();
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });
    }

    @Test
    @DisplayName("hp가 음수라면 0으로 설정")
    void setHpNegative() {
        Wizard wizard = new Wizard();
        wizard.setHp(-5);
        assertEquals(0, wizard.getHp());
    }

    @Test
    @DisplayName("mp가 음수라면 프로그램 종료")
    void setMpNegative() {
        Wizard wizard = new Wizard();
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-5);
        });
    }

    @Test
    @DisplayName("name이 null이라면 프로그램 종료")
    void setNameNull() {
        Wizard wizard = new Wizard();
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(null);
        });
    }

    @Test
    @DisplayName("name이 3 문자 미만이라면 프로그램 종료")
    void setNameLowerThree() {
        Wizard wizard = new Wizard();
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("aa");
        });
    }

}