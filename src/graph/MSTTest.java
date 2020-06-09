package graph;

import org.junit.Before;
import org.junit.Test;

public class MSTTest {

    private EdgeWeightedGraph g;

    @Before
    public void prepare(){
        g = new EdgeWeightedGraph(8);
        Edge e02 = new Edge(0,2,0.26);
        Edge e04 = new Edge(0,4,0.38);
        Edge e06 = new Edge(0,6,0.58);
        Edge e07 = new Edge(0,7,0.16);
        Edge e12 = new Edge(1,2,0.36);
        Edge e13 = new Edge(1,3,0.29);
        Edge e15 = new Edge(1,5,0.32);
        Edge e17 = new Edge(1,7,0.19);
        Edge e23 = new Edge(2,3,0.17);
        Edge e26 = new Edge(2,6,0.40);
        Edge e27 = new Edge(2,7,0.34);
        Edge e36 = new Edge(3,6,0.52);
        Edge e45 = new Edge(4,5,0.35);
        Edge e46 = new Edge(4,6,0.93);
        Edge e47 = new Edge(4,7,0.37);
        Edge e57 = new Edge(5,7,0.28);

        g.addEdge(e02);
        g.addEdge(e04);
        g.addEdge(e06);
        g.addEdge(e07);
        g.addEdge(e12);
        g.addEdge(e13);
        g.addEdge(e15);
        g.addEdge(e17);
        g.addEdge(e23);
        g.addEdge(e26);
        g.addEdge(e27);
        g.addEdge(e36);
        g.addEdge(e45);
        g.addEdge(e46);
        g.addEdge(e47);
        g.addEdge(e57);
    }

    @Test
    public void testKruskalMST(){
        System.out.println("Kruskal MST");
        KruskalMST mst = new KruskalMST(g);
        for(Edge e: mst.edges()){
            System.out.println("edge: "+e.either()+"-"+e.other(e.either()));
        }
    }

    @Test
    public void testPrimLazyMST(){
        System.out.println("Prim lazy MST");
        PrimLazyMST mst = new PrimLazyMST(g);
        for(Edge e: mst.edges()){
            System.out.println("edge: "+e.either()+"-"+e.other(e.either()));
        }
    }



}