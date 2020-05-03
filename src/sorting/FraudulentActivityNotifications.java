package sorting;

import java.util.Arrays;

public class FraudulentActivityNotifications {

    public static int run(int[] expenditure, int d){

        int ntfCount = 0;
        for(int i=0;i<expenditure.length && (i+d-1)<expenditure.length;i++){
            int hi = i+d-1;
            Quick.sort(expenditure, i, hi);
            double median = getMedian(expenditure, i,hi);
            if(hi+1< expenditure.length && expenditure[hi+1] >= median*2){
                ntfCount++;
            }
        }

        return ntfCount;
    }

    public static double getMedian(int[] expo, int lo, int hi){
        int len = hi-lo+1;
        int index = (hi-lo)/2 + lo;
        if(len%2 == 0){
            return expo[index]+expo[index+1]/(double)2;
        }else{
            return expo[index];
        }
    }

    public static class Quick{

        public static void sort(int[] a, int lo, int hi){
            if(hi<=lo) return;
            int j = partition(a, lo, hi);
            sort(a, lo, j-1);
            sort(a, j+1, hi);
        }

        private static int partition(int[] a, int lo, int hi){
            int i=lo,j=hi;

            while(true){

                while(a[i]<a[lo]) if(i<hi) i++;
                while(a[j]>a[lo]) if(j>lo) j--;

                if(j<=i) break;

                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            int tmp = a[lo];
            a[lo] = a[j];
            a[j] = tmp;

            return j;
        }
    }



}
