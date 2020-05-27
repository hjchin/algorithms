package graph;

import java.util.Stack;

public class TopologicalSort {

    boolean[] marked;
    Stack<Integer> postOrder = new Stack<Integer>();
    DirectedGraph g;

    TopologicalSort(DirectedGraph g){
        this.g = g;
        marked = new boolean[g.V()];
        for(int i=0;i<g.V();i++){
            if(!marked[i]) dps(g, i);
        }
    }

    private void dps(DirectedGraph g, int i){
        marked[i] = true;
        for(Integer x: g.adj(i)){
            if(!marked[x]) dps(g, x);
        }
        postOrder.push(i);
    }

    public String printOrder(){
        StringBuilder sb = new StringBuilder();
        while(!postOrder.isEmpty()){
            sb.append(postOrder.pop());
            if(!postOrder.isEmpty()) sb.append(">");
        }
        return sb.toString();
    }
}
