package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectedCycleTest {

    /*

      |-- 4 <-------------
      |   |              |
      |   v              |
      |   2 --> 0 --> 1  |
      |   |     |        |
      |   |     |        |
      |   v     v        |
       -> 3 --> 5 -------|
     */
    @Test
    public void test(){
        DirectedGraph dg = new DirectedGraph(6);
        dg.addEdge(0,1);
        dg.addEdge(0,5);
        dg.addEdge(2,0);
        dg.addEdge(2,3);
        dg.addEdge(3,5);
        dg.addEdge(4,2);
        dg.addEdge(4,3);
        dg.addEdge(5,4);

        DirectedCycle dc = new DirectedCycle(dg);
        assertEquals("2>0>5>4>2",dc.printCycle());

    }
}