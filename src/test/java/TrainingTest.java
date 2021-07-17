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
        assertEquals(14, actual);
    }

    @Test
    @DisplayName("return must be 6")
    public void forLoopTest(){
        // Given
        int number = 6;
        // When
        int actual = Training.forLoop(number);
        // Then
        assertEquals(6,actual);
    }

    @Test
    @DisplayName("Need to be Feuer")
    public void feuerTest() {
        // Given
        String stufe1 = "Stufe 3";
        // When
        String actual = Training.umweltK(stufe1);
        // Then
        assertEquals("Feuer", actual);
    }

    @Test
    @DisplayName("")
    public void wasserTest() {
        // Given

        // When

        // Then

    }
}