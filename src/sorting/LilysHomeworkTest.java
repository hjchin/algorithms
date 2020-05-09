package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class LilysHomeworkTest {

    /*

     idx: 2 -> 0
          5 -> 1
          3 -> 2
          1 -> 3

     ind  : 0 1 2 3
     ori  : 2 5 3 1
     end  : 1 2 3 5

     swap 0: 2 5 3 1
     swap 1: 1 5 3 2
     swap 2:

     */

    @Test
    public void test(){
        int[] array = {2,5,3,1};
        assertEquals(2,LilysHomework.run(array));
    }

    @Test
    public void test2(){
        int[] array = {7,15,12,3};
        assertEquals(2,LilysHomework.run(array));
    }

    @Test
    public void test3(){
        int[] array = {3,4,2,5,1};
        assertEquals(2,LilysHomework.run(array));
    }

    @Test
    public void testReverse(){
        int[] array = {2,5,3,1};
        LilysHomework.reverse(array);
        assertEquals(1,array[0]);
        assertEquals(3,array[1]);
        assertEquals(5, array[2]);
        assertEquals(2, array[3]);
    }

    @Test
    public void testReverse2(){
        int[] array = {3,4,2,5,1};
        LilysHomework.reverse(array);
        assertEquals(1,array[0]);
        assertEquals(5,array[1]);
        assertEquals(2, array[2]);
        assertEquals(4, array[3]);
        assertEquals(3, array[4]);
    }

}