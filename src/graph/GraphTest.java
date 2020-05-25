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

        Iterator<Integer> it = g.getAdj(1);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}