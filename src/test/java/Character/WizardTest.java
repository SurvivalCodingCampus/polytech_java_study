package Character;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    @DisplayName("heal() 실행 시 mp를 10 소모하여, 대상의 hp를 20 회복")
    void WizardHeal() {
        Wand wand = new Wand();
        Wizard wizard = new Wizard();
        Hero hero = new Hero();

        hero.setHp(50);
        int heroHp = hero.getHp();
        int wizardMp = wizard.getMp();

        wizard.heal(hero);
        heroHp += 20;
        wizardMp -= 10;

        assertEquals(heroHp, hero.getHp());
        assertEquals(wizardMp, wizard.getMp());
    }

    @Test
    @DisplayName("heal() 실행 시 mp가 10보다 작다면 힐 실패")
    void mpLess10() {
        Wand wand = new Wand();
        Wizard wizard = new Wizard();
        Hero hero = new Hero();

        hero.setHp(50);
        int heroHp = hero.getHp();
        wizard.setMp(5);
        wizard.heal(hero);

        assertEquals(heroHp, hero.getHp());
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