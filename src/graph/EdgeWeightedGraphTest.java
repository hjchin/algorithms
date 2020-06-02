package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class EdgeWeightedGraphTest {

    /*

                0 -- 1 -- 3 -- 4
                 \   |         |
                  \  |         |
                     2 --------|

     */

    @Test
    public void test(){

        EdgeWeightedGraph eg = new EdgeWeightedGraph(5);

        Edge e1 = new Edge(0,1, 0.2);
        Edge e2 = new Edge(1,3, 2.3);
        Edge e3 = new Edge(3,4, 0.5);
        Edge e4 = new Edge(0,2, 1.5);
        Edge e5 = new Edge(2,4, 1.8);
        Edge e6 = new Edge(1,2, 2.4);

        eg.addEdge(e1);
        eg.addEdge(e2);
        eg.addEdge(e3);
        eg.addEdge(e4);
        eg.addEdge(e5);
        eg.addEdge(e6);

        for(Edge e: eg.adj(1)){
            System.out.println(e.other(1));
        }
    }
}