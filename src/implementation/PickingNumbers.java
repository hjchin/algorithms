package implementation;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PickingNumbers {

    public static class SubList{
        int min;
        int max;
        int count = 0;

        public void updateMinMax(int v){
            if(v < min){
                min = v;
            }

            if(v > max){
                max = v;
            }
        }

        public void addElement(int v){
            if(min == 0 && max == 0){
                min = v;
                max = v;
            }else{
                updateMinMax(v);
            }

            count++;
        }

        public boolean isInRange(int v){
            return Math.abs(min - v) >= 0 && Math.abs(min - v) <= 1 && Math.abs(max - v) >=0 && Math.abs(max - v) <=1;
        }
    }

    public static int run(List<Integer> a) {

       int[] a_count = new int[101];
       for(int i=0;i<a.size();i++){
           a_count[a.get(i)]++;
       }

       int maxLength = 0;
       for(int i=1;i<a_count.length-1;i++){
           maxLength = Math.max(maxLength, a_count[i]+a_count[i+1]);
       }

       return maxLength;
    }
}
