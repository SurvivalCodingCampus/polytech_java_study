package Character;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    @DisplayName("이름과 태어난 연도를 입력하여 생성")
    void createInstance() {
        Person miki = new Person("miki", 1851);
        assertEquals("miki", miki.getName());
    }

    @Test
    @DisplayName("getAges(): 현재 연도와 태어난 연도를 뺀 값 반환")
    void setBirthYear() {
        Person jerry = new Person("jerry", 1025);
        assertEquals(1000, jerry.getAge());
    }
}