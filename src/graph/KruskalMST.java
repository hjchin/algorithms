package graph;

import sun.misc.Queue;

import java.util.PriorityQueue;
import java.util.Stack;


public class KruskalMST {

    PriorityQueue<Edge> minPQ;
    UnionFind uf;
    Stack<Edge> mst;
    int len;

    KruskalMST(EdgeWeightedGraph g){
        uf = new UnionFind(g.V());
        minPQ = new PriorityQueue<>();
        mst = new Stack<>();

        for(Edge e: g.edges()){
            minPQ.add(e);
        }

        while(!minPQ.isEmpty() && len < g.V()-1){
            Edge e = minPQ.remove();
            int v = e.either();
            int w = e.other(v);
            if(!uf.isConnected(v,w)){
                mst.push(e);
                uf.union(v,w);
            }
        }
    }

    Iterable<Edge> edges(){
        return mst;
    }
}
