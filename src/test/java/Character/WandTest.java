package Character;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {
    @Test
    @DisplayName("name이 null이라면 프로그램 종료")
    void setNameNull() {
        Wand wand = new Wand();
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(null);
        });
    }

    @Test
    @DisplayName("name이 3 문자 미만이라면 프로그램 종료")
    void setNameLowerThree() {
        Wand wand = new Wand();
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("aa");
        });
    }

    @Test
    @DisplayName("power가 0.5 미만이라면 프로그램 종료")
    void setPowerZero() {
        Wand wand = new Wand();
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(0.4);
        });
    }

    @Test
    @DisplayName("power가 100.0 초과라면 프로그램 종료")
    void setPowerHigher() {
        Wand wand = new Wand();
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(101);
        });
    }
}