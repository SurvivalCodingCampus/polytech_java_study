package com.survivalcoding;

import com.survivalcoding.game.Hero;
import com.survivalcoding.game.PoisonSlime;
import com.survivalcoding.game.Slime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlimeTest {
    @Test
    @DisplayName("슬라임 공격 테스트, 10 데미지를 가한다")
    void testSlimeAttack() {
        Hero hero = new Hero("Zelda"); // 체력설정 없이 생성할 경우 체력 50
        Slime slime = new Slime("Z"); // 슬라임 공격력 10

        slime.attack(hero);

        assertEquals(40, hero.getHp());
    }

    @Test
    @DisplayName("독 슬라임 공격 테스트, 슬라임 공격 능력에 더하여 독 피해는 계산 후 현재체력의 1/5만큼을 추가피해로 가한다")
    void testPoisonSlimeAttack() {
        Hero hero = new Hero("Zelda"); // 체력설정 없이 생성할 경우 체력 50
        Slime poisonSlime = new PoisonSlime("Y"); // 독 슬라임 공격력 10 (슬라임과 동일)

        poisonSlime.attack(hero);

        // 슬라임 공격력 10 적용, 이후 독 슬라임 효과로 피격대상 체력이 1/5 만큼 감소
        // (50 - 10) - ((50 - 10) / 5)
        assertEquals(32, hero.getHp());
    }
}