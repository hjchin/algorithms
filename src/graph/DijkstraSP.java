package graph;


import java.util.Stack;

public class DijkstraSP {

    DirectedEdge[] edgeTo;
    double[] distTo;
    IndexMinPQ<Double> pq;

    DijkstraSP(EdgeWeightedDigraph g, int s){
        edgeTo = new DirectedEdge[g.V()];
        distTo = new double[g.V()];
        pq = new IndexMinPQ<Double>(g.V());

        for(int i=0;i<g.V();i++) distTo[i] = Double.POSITIVE_INFINITY;
        distTo[s] = 0;
        pq.insert(s,0.0);

        while(!pq.isEmpty()){
            int v = pq.delMin();
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
            if(pq.contains(w)){
                pq.changeKey(w, e.weight());
            }else{
                pq.insert(w, e.weight());
            }
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
