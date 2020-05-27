package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void test(){
        /*

            0 - 1 - 2 - 7 - 8
            |   |
            4   3 - 6   9
                |
                5
         */
        Graph g = new Graph(10);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(3,5);
        g.addEdge(3,6);
        g.addEdge(2,7);
        g.addEdge(7,8);

        DepthFirstSearch dps = new DepthFirstSearch(g, 0);
        assertEquals("0", dps.pathTo(0));
        assertEquals("0>1>2>7>8", dps.pathTo(8));
        assertEquals("0>1>3>6", dps.pathTo(6));
        assertEquals(null, dps.pathTo(9));

        BreadthFirstSearch bfs = new BreadthFirstSearch(g, 0);
        assertEquals("0>1>3>6", bfs.pathTo(6));

    }

}