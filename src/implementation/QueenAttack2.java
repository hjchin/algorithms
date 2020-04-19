package implementation;

import java.util.HashSet;

public class QueenAttack2 {

    static int run(int n, int k, int r_q, int c_q, int[][] obstacles){

        int attack = 0;

        HashSet<String> obstacle = new HashSet<String>();
        for(int i=0;i<obstacles.length;i++){
            int r = obstacles[i][0];
            int c = obstacles[i][1];
            obstacle.add(r+"_"+c);
        }

        //queen goes up straight
        int row = r_q+1;
        while(row <= n && !obstacle.contains(row+"_"+c_q)){
            attack++;
            row++;
        }

        //gueen goes right up diagonally
        row = r_q+1;
        int col = c_q+1;
        while(row <=n && col <=n && !obstacle.contains(row+"_"+col)){
            attack++;
            row++;
            col++;
        }

        //queen goes right straight
        row = r_q;
        col = c_q+1;
        while(row <=n && col <=n && !obstacle.contains(row+"_"+col)){
            attack++;
            col++;
        }

        //queen goes right down diagonally
        row = r_q-1;
        col = c_q+1;
        while(row >0 && col <=n && !obstacle.contains(row+"_"+col)){
            attack++;
            row--;
            col++;
        }

        //queen goes down straight
        row = r_q-1;
        col = c_q;
        while(row >0 && !obstacle.contains(row+"_"+col)){
            attack++;
            row--;
        }

        //queen goes left down diagonally
        row = r_q-1;
        col = c_q-1;
        while(row >0 && col >0 && !obstacle.contains(row+"_"+col)){
            attack++;
            row--;
            col--;
        }

        //queen goes left straight
        row = r_q;
        col = c_q-1;
        while(col > 0 && !obstacle.contains(row+"_"+col)){
            attack++;
            col--;
        }

        //queen goes left up diagonally
        row = r_q+1;
        col = c_q-1;
        while(row <= n && col > 0 && !obstacle.contains(row+"_"+col)){
            attack++;
            row++;
            col--;
        }

        return attack;
    }
}
