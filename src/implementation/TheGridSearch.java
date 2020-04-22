package implementation;

import java.util.ArrayList;

public class TheGridSearch {

    public static String run(String[] G, String[] P){

        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0,l=0;i<G.length;i++, l=0){
            while(G[i].indexOf(P[0], l) > -1){
                l = G[i].indexOf(P[0], l);
                r.add(i);
                c.add(l);
                l++;
            }
        }

        if(r.size() == 0){
            return "NO";
        }

        for(int j=0;j<r.size();j++){
            int matchRow = 1;
            for(int i=r.get(j)+1,pi=1;i<G.length && pi < P.length;i++,pi++){
                int len = P[pi].length();
                int index = c.get(j)+len;
                if(!G[i].substring(c.get(j),index).equals(P[pi])){
                    break;
                }else{
                    matchRow++;
                }
            }
            if(matchRow == P.length) return "YES";
        }

        return "NO";

    }
}
