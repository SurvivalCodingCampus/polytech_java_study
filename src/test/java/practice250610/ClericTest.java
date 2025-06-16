package practice250610;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("이름과 hp, mp를 지정하여 Cleric을 생성한다")
    void ClericInputNameHpMp() {
        Cleric cleric = new Cleric("A", 30, 20);
        assertEquals("A", cleric.name);
        assertEquals(30, cleric.hp);
        assertEquals(20, cleric.mp);
    }

    @Test
    @DisplayName("이름과 hp를 지정하여 Cleric을 생성한다. mp는 maxMp로 초기화 된다")
    void ClericInputNameHp() {
        Cleric cleric = new Cleric("A", 30);
        assertEquals("A", cleric.name);
        assertEquals(30, cleric.hp);
        assertEquals(Cleric.maxMp, cleric.mp);
    }

    @Test
    @DisplayName("이름을 지정하여 Cleric을 생성한다. hp는 maxHp, mp는 maxMp로 초기화 된다")
    void ClericInputName() {
        Cleric cleric = new Cleric("A");
        assertEquals("A", cleric.name);
        assertEquals(Cleric.maxHp, cleric.hp);
        assertEquals(Cleric.maxMp, cleric.mp);
    }

    @Test
    @DisplayName("hp가 maxHp일 때 체력은 변하지않고 mp만 5 소모된다")
    void selfAidTestMaxHp() {
        Cleric cleric = new Cleric("Cleric");
        cleric.selfAid();
        assertEquals(Cleric.maxHp, cleric.hp);
        assertEquals(Cleric.maxMp - 5, cleric.mp);
    }

    @Test
    @DisplayName("mp가 5미만이라면 hp와 mp의 변화가 없다")
    void selfAidTestLowMp() {
        Cleric cleric = new Cleric("Cleric");
        cleric.hp -= 10;
        cleric.mp -= 7;
        cleric.selfAid();
        assertEquals(Cleric.maxHp - 10, cleric.hp);
        assertEquals(Cleric.maxMp - 7, cleric.mp);
    }

    @Test
    @DisplayName("pray() 호출 시 랜덤값 ~ +2 반환")
    void prayTestRand() {
        Cleric cleric = new Cleric("Cleric");
        cleric.mp = 0;
        int rand = cleric.pray(5);
        int check = 0;
        if (rand >= 5 && rand <= 7) {
            check = 1;
        }
        assertEquals(cleric.mp, rand);
        assertEquals(1, check);
    }

    @Test
    @DisplayName("mp가 최대라면 0리턴")
    void prayTestMaxMp() {
        Cleric cleric = new Cleric("Cleric");
        int n = cleric.pray(3);
        assertEquals(0, n);
    }

    @Test
    @DisplayName("sec이 음수나 0이라면 0리턴")
    void prayTestLoeSec() {
        Cleric cleric = new Cleric("Cleric");
        int n = cleric.pray(-3);
        assertEquals(0, n);
    }
}