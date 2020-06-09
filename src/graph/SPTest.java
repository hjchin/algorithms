package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SPTest {

    EdgeWeightedDigraph g;

    @Before
    public void prep(){
        g = new EdgeWeightedDigraph(8);
        g.addEdge(new DirectedEdge(0,1,5.0));
        g.addEdge(new DirectedEdge(0,4,9.0));
        g.addEdge(new DirectedEdge(0,7,8.0));
        g.addEdge(new DirectedEdge(1,2,12.0));
        g.addEdge(new DirectedEdge(1,3,15.0));
        g.addEdge(new DirectedEdge(1,7,4.0));
        g.addEdge(new DirectedEdge(2,3,3.0));
        g.addEdge(new DirectedEdge(2,6,11.0));
        g.addEdge(new DirectedEdge(3,6,9.0));
        g.addEdge(new DirectedEdge(4,5,4.0));
        g.addEdge(new DirectedEdge(4,6,20.0));
        g.addEdge(new DirectedEdge(4,7,5.0));
        g.addEdge(new DirectedEdge(5,2,1.0));
        g.addEdge(new DirectedEdge(5,2,1.0));
        g.addEdge(new DirectedEdge(5,6,13.0));
        g.addEdge(new DirectedEdge(7,5,6.0));
        g.addEdge(new DirectedEdge(7,2,7.0));
    }

    @Test
    public void testDijkstraSP(){
        DijkstraSP sp = new DijkstraSP(g, 0);
        Iterable<DirectedEdge> edges = sp.pathTo(3);
        String p = "";
        for(DirectedEdge e: edges){
           String path = e.from()+"->"+e.to();
           p = path+ (p.length() > 0 ? ",":"" )+p;
        }
        System.out.println(p);
    }

}