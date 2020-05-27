package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopologicalSortTest {

    @Test
    public void test(){

        /*

       --> 0 --> 2 <----
       |   | \   A     |
       |   |  >  5  <  |
       |   V         \ |
       |   1 --> 4 <-  3
       |         A     |
       --- 6 ----|     |
           A           |
           |           |
           ------------|

         */

        DirectedGraph dg = new DirectedGraph(7);
        dg.addEdge(0,1);
        dg.addEdge(0,2);
        dg.addEdge(0,5);
        dg.addEdge(1,4);
        dg.addEdge(3,2);
        dg.addEdge(3,4);
        dg.addEdge(3,5);
        dg.addEdge(3,6);
        dg.addEdge(5,2);
        dg.addEdge(6,4);
        dg.addEdge(6,0);
        assertEquals(7,dg.V());

        TopologicalSort t = new TopologicalSort(dg);
        assertEquals("3>6>0>5>2>1>4",t.printOrder());

    }


}
