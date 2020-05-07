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


}