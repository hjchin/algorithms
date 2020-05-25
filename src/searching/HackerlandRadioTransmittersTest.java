package searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class HackerlandRadioTransmittersTest {

    @Test
    public void run() {
        //1,2,3,4,5
        assertEquals(2, HackerlandRadioTransmitters.run(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void run2() {
        //2 4 5 6 7 9 11 12
        assertEquals(3, HackerlandRadioTransmitters.run(new int[]{7, 2, 4, 6, 5, 9, 12, 11}, 2));
    }

    @Test
    public void run4() {
        //2 4 5 6 7 9 11 12
        assertEquals(2, HackerlandRadioTransmitters.run(new int[]{7, 2, 4, 6, 5, 9, 12, 11}, 3));
    }
}