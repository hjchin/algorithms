package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class timeInWordsTest {

    @Test
    public void test(){
        assertEquals("five o' clock",timeInWords.run(5,0));
        assertEquals("one minute past five",timeInWords.run(5,1));
        assertEquals("ten minutes past five",timeInWords.run(5,10));
        assertEquals("quarter past five",timeInWords.run(5,15));
        assertEquals("half past five",timeInWords.run(5,30));
        assertEquals("twenty minutes to six",timeInWords.run(5,40));
        assertEquals("quarter to six",timeInWords.run(5,45));
        assertEquals("thirteen minutes to six",timeInWords.run(5,47));
        assertEquals("twenty eight minutes past five",timeInWords.run(5,28));
    }
}