package graph;

import java.util.Stack;

public class DirectedCycle {

    DirectedGraph dg;
    boolean[] onStack;
    boolean[] marked;
    int[] edgeTo;
    Stack<Integer> cycle;

    DirectedCycle(DirectedGraph dg){
        onStack = new boolean[dg.V()];
        marked = new boolean[dg.V()];
        edgeTo = new int[dg.V()];

        for(int i=0;i<dg.V();i++){
            if(!marked[i]) dfs(dg,i);
        }
    }

    private void dfs(DirectedGraph g, int v){
        System.out.println("visit "+v);
        marked[v] = true;
        onStack[v] = true;
        for(Integer w: g.adj(v)){
            if(cycle != null) return;
            if(!marked[w]){
                edgeTo[w]=v;
                dfs(g, w);
            }else if(onStack[w]){
                cycle = new Stack<>();
                for(int x=v;x!=w;x=edgeTo[x]){
                    cycle.push(x);
                }
                cycle.push(w);
                cycle.push(v);
            }
        }
        onStack[v] = false;
    }

    public String printCycle(){
        StringBuilder bs = new StringBuilder();
        while(!cycle.isEmpty()){
            bs.append(cycle.pop());
            if(!cycle.isEmpty()) bs.append(">");
        }
        return bs.toString();
    }

}
