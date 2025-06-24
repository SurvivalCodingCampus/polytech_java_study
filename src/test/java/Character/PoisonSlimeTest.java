package Character;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {
    @Test
    @DisplayName("생성자 실행")
    void createPoisonSlime() {
        PoisonSlime poisonSlime = new PoisonSlime("A");
        assertEquals("A", poisonSlime.getSuffix());
        assertEquals(100, poisonSlime.getHp());
        assertEquals(5, poisonSlime.getPoisonCount());
    }

    @Test
    @DisplayName("공격 시 독 카운트가 0이 아니라면, 용사의 HP의 1/5에 해당하는 독 데미지를 추가로 입힌다")
    void createAttack() {
        System.out.println("===== createAttack() =====");
        Hero hero = new Hero();
        PoisonSlime poisonSlime = new PoisonSlime("A");
        int damage = 0, currentHp = 500, poison = 5;
        int baseDamage = poisonSlime.getDamage();

        hero.setHp(currentHp);
        poisonSlime.attack(hero);
        damage = baseDamage + ((currentHp - baseDamage) / 5);
        currentHp -= damage;
        poison--;

        assertEquals(currentHp, hero.getHp());
        assertEquals(poison, poisonSlime.getPoisonCount());
    }

    @Test
    @DisplayName("독 카운트가 0이라면, 독 데미지는 입지 않는다")
    void poisonCountZero() {
        System.out.println("===== createCountZero() =====");
        Hero hero = new Hero();
        PoisonSlime poisonSlime = new PoisonSlime("A");
        int damage, currentHp = 500, poison = 5;
        int baseDamage = poisonSlime.getDamage();

        hero.setHp(currentHp);
        for (int i = poison; poison > 0; poison--) {
            poisonSlime.attack(hero);
            damage = baseDamage + ((currentHp - baseDamage) / 5);
            currentHp -= damage;
        }

        poisonSlime.attack(hero);
        currentHp -= baseDamage;

        assertEquals(currentHp, hero.getHp());
        assertEquals(poison, poisonSlime.getPoisonCount());
    }
}