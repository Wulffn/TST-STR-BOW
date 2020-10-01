package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private Bowling bowling;

    @BeforeEach
    protected void setUp() throws Exception {
        bowling = new Bowling();
    }

    @Test
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            bowling.roll(pins);
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, bowling.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, bowling.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        rollSpare();
        bowling.roll(3);
        rollMany(17, 0);
        assertEquals(16, bowling.score());
    }

    @Test
    public void testOneStrike() throws Exception {
        rollStrike();
        bowling.roll(3);
        bowling.roll(4);
        rollMany(16, 0);
        assertEquals(24, bowling.score());
    }

    @Test
    public void testPerfectGame() throws Exception {
        rollMany(12, 10);
        assertEquals(300, bowling.score());
    }

    private void rollSpare() {
        bowling.roll(5);
        bowling.roll(5);
    }

    private void rollStrike() {
        bowling.roll(10);
    }

}
