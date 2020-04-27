package strings;

import java.util.*;

public class CommonChild {

    public static int run(String s1, String s2){

        int[][] map = new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    map[i][j] = map[i-1][j-1] + 1;
                }else{
                    map[i][j] = Math.max(map[i][j-1], map[i-1][j]);
                }
            }
        }

        return map[s1.length()][s2.length()];
    }
}
