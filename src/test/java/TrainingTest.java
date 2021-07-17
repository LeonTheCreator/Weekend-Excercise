import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTest {

    @Test
    @DisplayName("return must be 20")
    public void addTest() {
        // given
        int input1 = 11;
        int input2 = 6;
        int input3 = 3;
        // when
        int actual = Training.add(input1, input2, input3);
        //then
        assertEquals(20, actual);
    }
}