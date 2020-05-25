package searching;

import java.util.*;

public class HackerlandRadioTransmitters {

    public static int run(int[] x, int k){

        if(x.length == 0) return 0;

        Arrays.sort(x);

        int radioCount = 0;
        int lastRadio = x[0];
        int i=0;

        while(i<x.length){

            while(i< x.length && x[i] <= lastRadio+k){
                i++;
            }

            radioCount++;

            if(i<x.length){
                lastRadio = x[--i];
                System.out.print(" "+lastRadio+",");
            }else{
                System.out.print(" "+x[i-1]+",");
            }

            while(i< x.length && x[i] <= lastRadio+k){
                i++;
            }

            if(i<x.length){
                lastRadio = x[i];
            }
        }

        return radioCount;
    }
}
