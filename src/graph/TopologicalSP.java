package graph;

import java.util.Stack;

public class TopologicalSP{

    DirectedEdge[] edgeTo;
    double[] distTo;

    TopologicalSP(EdgeWeightedDigraph g, int s){
        edgeTo = new DirectedEdge[g.V()];
        distTo = new double[g.V()];
        for(int i=0;i<g.V();i++) distTo[i] = Double.POSITIVE_INFINITY;
        distTo[s] = 0.0;

        TopologicalEdgeWeightedSort ts = new TopologicalEdgeWeightedSort(g);
        for(int v:ts.order()){
            for(DirectedEdge e: g.adj(v)){
                relax(e);
            }
        }
    }

    private void relax(DirectedEdge e){
        int w = e.to(), v = e.from();
        if(distTo[w] > distTo[v] + e.weight()){
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
        }
    }

    Iterable<DirectedEdge> pathTo(int v){
        Stack<DirectedEdge> s = new Stack<DirectedEdge>();
        for(DirectedEdge e=edgeTo[v];e!=null;e=edgeTo[e.from()]){
            s.add(e);
        }
        return s;
    }

    double distTo(int v){
        return distTo[v];
    }
}
