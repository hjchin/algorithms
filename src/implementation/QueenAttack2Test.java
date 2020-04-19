package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueenAttack2Test {

    @Test
    public void test(){
        int[][] obstacles = new int[0][0];
        assertEquals(9,QueenAttack2.run(4, 0, 4, 4, obstacles));
    }

    @Test
    public void test2(){
        int[][] obstacles = {{5,5},{4,2},{2,3}};
        assertEquals(10,QueenAttack2.run(5, 3, 4, 3, obstacles));
    }

    @Test
    public void test3(){
        int[][] obstacles = new int[0][0];
        assertEquals(0,QueenAttack2.run(1, 0, 1, 1, obstacles));
    }
}