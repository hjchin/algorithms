package graph;

import java.util.Stack;

public class TopologicalEdgeWeightedSort {

    boolean[] marked;
    Stack<Integer> preorder;

    TopologicalEdgeWeightedSort(EdgeWeightedDigraph g){
        marked = new boolean[g.V()];
        preorder = new Stack<Integer>();
        for(int i=0;i<g.V();i++){
            if(!marked[i])dps(g,i);
        }
    }

    private void dps(EdgeWeightedDigraph g, int v){
        marked[v] = true;
        for(DirectedEdge e: g.adj(v)){
            dps(g,e.to());
        }
        preorder.push(v);
    }

    public int[] order(){
        int[] t = new int[preorder.size()];
        int i=0;
        while(!preorder.isEmpty()){
            t[i++]=preorder.pop();
        }
        return t;
    }
}
