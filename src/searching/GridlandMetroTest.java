package searching;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class GridlandMetroTest {


    @Test
    public void test(){
        int[][] track = {{2,2,3},{3,1,4},{4,4,4}};
        GridlandMetro.run(4,4,3, track);
    }

    @Test
    public void testOverlap(){
        //testKruskalMST overlap at left;

        /*
            ---
             ---
         */
        GridlandMetro.Track t1 = new GridlandMetro.Track(1,3);
        GridlandMetro.Track t2 = new GridlandMetro.Track(2,4);
        GridlandMetro.Track t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(4,t3.end);

        /*
            ---
              ---
         */
        t1 = new GridlandMetro.Track(1,3);
        t2 = new GridlandMetro.Track(3,4);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(4,t3.end);

        /*
            ---
              -
         */
        t1 = new GridlandMetro.Track(1,3);
        t2 = new GridlandMetro.Track(3,3);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(3,t3.end);

        /*
              -
              -
         */
        t1 = new GridlandMetro.Track(3,3);
        t2 = new GridlandMetro.Track(3,3);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(3,t3.start);
        assertEquals(3,t3.end);

        /*
              ----
              -
         */
        t1 = new GridlandMetro.Track(1,4);
        t2 = new GridlandMetro.Track(1,1);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(4,t3.end);


        //overlap on the right

        /*
            ----
           ----
         */
        t1 = new GridlandMetro.Track(2,5);
        t2 = new GridlandMetro.Track(1,4);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(5,t3.end);

        /*
              --
           ----
         */
        t1 = new GridlandMetro.Track(4,5);
        t2 = new GridlandMetro.Track(1,4);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(5,t3.end);

        /*
              --
              -
         */
        t1 = new GridlandMetro.Track(4,5);
        t2 = new GridlandMetro.Track(4,4);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(4,t3.start);
        assertEquals(5,t3.end);

        /*
                 -
                --
        */
        t1 = new GridlandMetro.Track(5,5);
        t2 = new GridlandMetro.Track(4,5);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(4,t3.start);
        assertEquals(5,t3.end);

        /*
             --
            ---
         */
        t1 = new GridlandMetro.Track(2,3);
        t2 = new GridlandMetro.Track(1,3);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(3,t3.end);

        /*
            --
           ----
         */
        t1 = new GridlandMetro.Track(2,3);
        t2 = new GridlandMetro.Track(1,4);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(4,t3.end);

        /*
            ---
           ----
         */
        t1 = new GridlandMetro.Track(2,4);
        t2 = new GridlandMetro.Track(1,4);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(4,t3.end);

        /*
            -----
             -
         */
        t1 = new GridlandMetro.Track(1,5);
        t2 = new GridlandMetro.Track(2,2);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(1,t3.start);
        assertEquals(5,t3.end);


        /*
            ----
                -
         */
        t1 = new GridlandMetro.Track(1,4);
        t2 = new GridlandMetro.Track(5,5);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(null,t3);

        /*
             ----
            -
         */
        t1 = new GridlandMetro.Track(2,5);
        t2 = new GridlandMetro.Track(1,1);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(null,t3);

        /*
              ----
            -
         */
        t1 = new GridlandMetro.Track(3,6);
        t2 = new GridlandMetro.Track(1,1);
        t3 = GridlandMetro.overlap(t1, t2);
        assertEquals(null,t3);

    }

    @Test
    public void testMerge(){
        ArrayList<GridlandMetro.Track> input = new ArrayList<GridlandMetro.Track>();
        input.add(new GridlandMetro.Track(1,6));
        input.add(new GridlandMetro.Track(6,6));
        GridlandMetro.merge(input);
        assertEquals(1, input.size());
        assertEquals(1, input.get(0).start);
        assertEquals(6, input.get(0).end);
    }

    @Test
    public void testMerge2(){
        ArrayList<GridlandMetro.Track> input = new ArrayList<GridlandMetro.Track>();
        input.add(new GridlandMetro.Track(6,6));
        input.add(new GridlandMetro.Track(1,6));
        GridlandMetro.merge(input);
        assertEquals(1, input.size());
        assertEquals(1, input.get(0).start);
        assertEquals(6, input.get(0).end);
    }

    @Test
    public void testMerge3(){
        ArrayList<GridlandMetro.Track> input = new ArrayList<GridlandMetro.Track>();
        input.add(new GridlandMetro.Track(6,6));
        input.add(new GridlandMetro.Track(1,6));
        input.add(new GridlandMetro.Track(6,8));
        GridlandMetro.merge(input);
        assertEquals(1, input.size());
        assertEquals(1, input.get(0).start);
        assertEquals(8, input.get(0).end);
    }

    @Test
    public void testMerge4(){
        ArrayList<GridlandMetro.Track> input = new ArrayList<GridlandMetro.Track>();
        input.add(new GridlandMetro.Track(7,8));
        input.add(new GridlandMetro.Track(6,6));
        input.add(new GridlandMetro.Track(1,6));
        GridlandMetro.merge(input);
        assertEquals(2, input.size());
        assertEquals(7, input.get(0).start);
        assertEquals(8, input.get(0).end);
        assertEquals(1, input.get(1).start);
        assertEquals(6, input.get(1).end);
    }
    /*
    3 7 4

    1 1 3
    2 2 2
    3 1 6
    3 6 6

    expected 12
     */

    @Test
    public void test2(){
        int[][] track = {{1,1,3},{2,2,2},{3,1,6},{3,6,6}};
        assertEquals(11,GridlandMetro.run(3,7,4, track));
    }

    @Test
    public void test3(){
        int[][] track = {{2,1,5},{2,2,4},{2,8,8},{2,5,6}};
        assertEquals(11,GridlandMetro.run(2,9,4, track));
    }

}