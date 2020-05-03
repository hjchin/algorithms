package sorting;

public class FraudulentActivityNotifications {

    public static int run(int[] expenditure, int d){

        int ntfCount = 0;
        for(int i=0;i<expenditure.length && (i+d-1)<expenditure.length;i++){
            int hi = i+d-1;
            Insertion.sort(expenditure, i, hi);
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

    public static class Insertion {

        public static void sort(int[] a, int lo, int hi) {
            for (int i = lo; i <= hi; i++) {
                for (int j = i; j > 0; j--) {
                    if (a[j] < a[j - 1]) {
                        int tmp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = tmp;
                    } else {
                        break;
                    }
                }
            }

        }
    }
}
