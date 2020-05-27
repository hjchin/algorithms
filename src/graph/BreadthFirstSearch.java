package graph;

import sun.misc.Queue;

import java.util.Stack;

public class BreadthFirstSearch {

    Graph g;
    boolean[] marked;
    int[] edgeTo;
    int root;
    Queue<Integer> q = new Queue<>();

    BreadthFirstSearch(Graph g, int s){
        this.g = g;
        root = s;
        edgeTo = new int[g.V()];
        marked = new boolean[g.V()];
        bfs(g,s);
    }

    private void bfs(Graph g, int s){
        q.enqueue(s);
        while(!q.isEmpty()){
            try {
                int n = q.dequeue();
                marked[n] = true;
                for(int i : g.getAdj(n)){
                    if(!marked[i]){
                        q.enqueue(i);
                        edgeTo[i] = n;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
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
