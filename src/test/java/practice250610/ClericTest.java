package practice250610;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("hp가 maxHp일 때 체력은 변하지않고 mp만 5 소모된다")
    void selfAidTestMaxHp() {
        Cleric cleric = new Cleric();
        cleric.selfAid();
        assertEquals(cleric.hp, cleric.maxHp);
        assertEquals(cleric.mp, cleric.maxMp-5);
    }

    @Test
    @DisplayName("mp가 5미만이라면 hp와 mp의 변화가 없다")
    void selfAidTestLowMp(){
        Cleric cleric = new Cleric();
        cleric.hp -= 10;
        cleric.mp -= 7;
        cleric.selfAid();
        assertEquals(cleric.hp, cleric.maxHp-10);
        assertEquals(cleric.mp, cleric.maxMp-7);
    }

    @Test
    @DisplayName("pray() 호출 시 랜덤값 ~ +2 반환")
    void prayTestRand(){
        Cleric cleric = new Cleric();
        cleric.mp = 0;
        int rand = cleric.pray(5);
        int check=0;
        if(rand>=5 && rand<=8){
            check=1;
        }
        assertEquals(cleric.mp, rand);
        assertEquals(1, check);
    }

    @Test
    @DisplayName("mp가 최대라면 0리턴")
    void prayTestMaxMp() {
        Cleric cleric = new Cleric();
        int n = cleric.pray(3);
        assertEquals(0, n);
    }

    @Test
    @DisplayName("sec이 음수나 0이라면 0리턴")
    void prayTestLoeSec() {
        Cleric cleric = new Cleric();
        int n = cleric.pray(-3);
        assertEquals(0, n);
    }
}