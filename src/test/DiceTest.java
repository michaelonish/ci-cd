import org.example.objects.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {

    @Test
    public void testRoll() {
        assertTrue(result >= 1 && result <= 6, "Rolled value is within the valid range");
    }

    @Test
    public void testRollMany() {
        assertEquals(5, rolls.length, "Correct number of rolls returned");
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 10, "Rolled value is within the valid range");
        }
    }

    @Test
    public void testToString() {
        assertEquals("A 8 sided die", result, "Correct toString representation");
    }
}
