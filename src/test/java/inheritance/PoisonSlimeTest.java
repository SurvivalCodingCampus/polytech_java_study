package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {

    @Test
    @DisplayName("")
    void attack1() {
        // given (준비)
        final PoisonSlime PoisonSlime = new PoisonSlime("poison", 10);
        final Hero hero = new Hero("영웅", 100);
        int poisonCount = 1;

        // when (실행)
        PoisonSlime.attack(hero);

        // then (검증)
        assertEquals(85, hero.getHp());
        assertEquals(0, poisonCount);

    }

    @Test
    @DisplayName("")
    void attack2() {
        // given (준비)
        final PoisonSlime PoisonSlime = new PoisonSlime("poison", 10);
        final Hero hero = new Hero("영웅", 100);
        int poisonCount = 0;

        // when (실행)
        PoisonSlime.attack(hero);

        // then (검증)
        assertEquals(90, hero.getHp());

    }
}