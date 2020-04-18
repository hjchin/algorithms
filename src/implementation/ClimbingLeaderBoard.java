package implementation;

import java.util.*;
import java.util.stream.Collectors;


public class ClimbingLeaderBoard {

    public static int[] run(int[] scores, int[] alice){

        List<Integer> scoreList = Arrays.stream(scores).boxed().collect(Collectors.toList());
        Set<Integer> scoreSet = new LinkedHashSet<Integer>(scoreList);
        scoreList = new ArrayList<>(scoreSet);
        scoreList.add(0,0);
        int[] aliceRank = new int[alice.length];

        int scoreListIndex = scoreList.size()-1;
        for(int i=0;i<alice.length;i++){

            if(alice[i]>=scoreList.get(1)){
                aliceRank[i] = 1;
                continue;
            }

            for(int j=scoreListIndex;j>0;j--){
                if(alice[i] < scoreList.get(j)){
                    aliceRank[i] = j+1;
                    break;
                }

                if(alice[i] == scoreList.get(j)){
                    aliceRank[i] = j;
                    scoreListIndex = j;
                    break;
                }
            }
        }

        return aliceRank;
    }
}
