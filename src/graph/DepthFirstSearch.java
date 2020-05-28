package graph;

import java.util.Stack;

public class DepthFirstSearch {

    Graph g;
    int root;
    int[] edgeTo;
    boolean[] marked;

    DepthFirstSearch(Graph g, int s){
        this.g = g;
        this.root = s;
        edgeTo = new int[g.V()];
        marked = new boolean[g.V()];
        dps(g, s);
    }

    private void dps(Graph g, int s){
        marked[s] = true;
        for(int i:g.getAdj(s)){
            if(!marked[i]){
                edgeTo[i] = s;
                dps(g, i);
            }
        }
    }

    public String pathTo(int x){

        if(!marked[x]) return null;

        Stack<Integer> path = new Stack<Integer>();
        while(x != root){
            path.push(x);
            x = edgeTo[x];
        }
        path.push(root);

        StringBuilder sb = new StringBuilder();
        while(!path.isEmpty()){
            sb.append(path.pop());
            if(!path.isEmpty()) sb.append(">");
        }
        return sb.toString();
    }
}
