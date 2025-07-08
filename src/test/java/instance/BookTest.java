package instance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

class BookTest {

    @Test
    @DisplayName("제목과 출간일(예: 2024-01-01)이 같으면 같은 책으로 판단한다.")
    void shouldConsiderBookWithSameTitleAndPublicationDateAsEqual() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, 1);
        Calendar.set(Calendar.DAY_OF_MONTH, 1);


    }

}