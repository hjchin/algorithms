package graph;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GraphTest {


    @Test
    public void testGraph(){
        Graph g = new Graph(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,2);

        for(Integer i: g.getAdj(1)){
            System.out.println(i);
        }
    }

    @Test
    public void testDirectedGraph(){
        DirectedGraph g = new DirectedGraph(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,2);
        assertEquals(0,g.degree(2));
    }

}