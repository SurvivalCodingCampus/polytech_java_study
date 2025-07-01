import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrongBoxTest {

    @Test
    public void testPutAndGetWithPadlock() {
        StrongBox<String> box = new StrongBox<>(StrongBox.KeyType.PADLOCK);
        box.put("1024번 시도");

        for (int i = 0; i < 1023; i++) {
            assertNull(box.get()); // 안열림
        }
        assertEquals("1024번 시도", box.get());
    }

    @Test
    public void testIsUnlocked() {
        StrongBox<String> box = new StrongBox<>(StrongBox.KeyType.BUTTON);
        box.put("10000번 시도");

        for (int i = 0; i < 9999; i++) {
            assertNull(box.get());
        }

        assertEquals("10000번 시도", box.get());
    }

    @Test
    public void testMultipleItems() {
        StrongBox<String> box = new StrongBox<>(StrongBox.KeyType.DIAL);
        box.put("30000번 시도");

        for (int i = 0; i < 29999; i++) {
            assertNull(box.get());
        }

        assertEquals("30000번 시도", box.get());
    }

    @Test
    public void testFingerLock() {
        StrongBox<String> box = new StrongBox<>(StrongBox.KeyType.FINGER);
        box.put("1000000번 시도");

        for (int i = 0; i < 999999; i++) {
            assertNull(box.get()); // 안열림
        }

        // 열림
        assertEquals("1000000번 시도", box.get());
    }
}
