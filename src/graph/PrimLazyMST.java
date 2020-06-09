package graph;

import sun.misc.Queue;

import java.util.PriorityQueue;
import java.util.Stack;

public class PrimLazyMST {

    Stack<Edge> mst;
    PriorityQueue<Edge> pq;
    boolean[] marked;

    PrimLazyMST(EdgeWeightedGraph g){
        marked = new boolean[g.V()];
        mst = new Stack<Edge>();
        pq = new PriorityQueue<Edge>();

        visit(g, 0);

        while(!pq.isEmpty() && mst.size() < g.V()-1){
            Edge e = pq.remove();
            if(marked[e.either()] && marked[e.other(e.either())]) continue;
            mst.push(e);
            if(!marked[e.either()]) visit(g, e.either());
            if(!marked[e.other(e.either())]) visit(g, e.other(e.either()));
        }
    }

    private void visit(EdgeWeightedGraph g, int v){
        marked[v] = true;
        for(Edge e: g.adj(v)){
            if(!marked[e.other(v)])pq.add(e);
        }
    }

    Iterable<Edge> edges(){
        return mst;
    }
}
