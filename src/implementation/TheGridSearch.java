package implementation;

public class TheGridSearch {

    public static String run(String[] G, String[] P){

        int pi=0;
        int i=0;
        int l=0;
        for(;i<G.length;i++){
            l = G[i].indexOf(P[pi]);
            if(l > -1){
                break;
            }
        }

        if(l == -1){
            return "NO";
        }

        for(i=i+1,pi=pi+1;i<G.length && pi < P.length;i++,pi++){
            int len = P[pi].length();
            int index = l+len;
            if(!G[i].substring(l,index).equals(P[pi])){
                return "NO";
            }
        }

        return "YES";

    }
}
