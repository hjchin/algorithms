package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingLeaderBoardTest {

    @Test
    public void test(){
        int[] scores = {100,100,50,40,40,20,10};
        int[] alice = {5,25,50,120};
        int[] result = ClimbingLeaderBoard.run(scores, alice);
        assertEquals(6, result[0]);
        assertEquals(4, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);
    }

    @Test
    public void test2(){
        int[] scores = {100,90,90,80,75,60};
        int[] alice = {50,65,77,90,102};
        int[] result = ClimbingLeaderBoard.run(scores, alice);
        assertEquals(6, result[0]);
        assertEquals(5, result[1]);
        assertEquals(4, result[2]);
        assertEquals(2, result[3]);
        assertEquals(1, result[4]);
    }
}