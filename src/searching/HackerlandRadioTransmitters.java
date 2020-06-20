package searching;

import java.util.*;

/*
Hackerland is a one-dimensional city with houses aligned at integral locations along a road. The Mayor wants to install radio transmitters on the roofs of the city's houses. Each transmitter has a fixed range meaning it can transmit a signal to all houses within that number of units distance away.

Given a map of Hackerland and the transmission range, determine the minimum number of transmitters so that every house is within range of at least one transmitter. Each transmitter must be installed on top of an existing house.

For example, assume houses are located at  and the transmission range .  antennae at houses  and  and  would provide complete coverage. There is no house at location  to cover both  and . Ranges of coverage, are , , and .

 */
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
