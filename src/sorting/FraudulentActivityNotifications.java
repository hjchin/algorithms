package sorting;

import sun.misc.Queue;
/*
HackerLand National Bank has a simple policy for warning clients about possible fraudulent account activity. If the amount spent by a client on a particular day is greater than or equal to  the client's median spending for a trailing number of days, they send the client a notification about potential fraud. The bank doesn't send the client any notifications until they have at least that trailing number of prior days' transaction data.

Given the number of trailing days  and a client's total daily expenditures for a period of  days, find and print the number of times the client will receive a notification over all  days.

For example,  and . On the first three days, they just collect spending data. At day , we have trailing expenditures of . The median is  and the day's expenditure is . Because , there will be a notice. The next day, our trailing expenditures are  and the expenditures are . This is less than  so no notice will be sent. Over the period, there was one notice sent.

 */
public class FraudulentActivityNotifications {

    public static int run(int[] expenditure, int d){

        int ntfCount = 0;
        int[] countingSort = new int[201];
        Queue<Integer> q = new Queue<>();

        for(int i=0;i<d;i++){
            countingSort[expenditure[i]]++;
            q.enqueue(expenditure[i]);
        }

        for(int i=d;i<expenditure.length;i++){

            double median = findMedian(countingSort, d);
            if(expenditure[i] >= median * 2){
                ntfCount++;
            }

            try {
                if(!q.isEmpty()) {
                    Integer index = q.dequeue();
                    countingSort[index]--;
                    q.enqueue(expenditure[i]);
                    countingSort[expenditure[i]]++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return ntfCount;
    }

    public static double findMedian(int[] countingSort, int size){

        if(size%2 == 0){ //if size is even, median = (index1 + index2) / 2

            int count = size/2;
            int index = 0;
            while(count>0) count -= countingSort[index++];

            index--;

            if(count < 0) return index;//the median value (index+index)/2 = index

            int index2=index+1;

            while(countingSort[index2] == 0){
                index2++;
            }

            return (index+index2)/2d;

        }else{ //if size is odd, median =  value of index1

            int count = size/2+1;
            int index = 0;
            while(count>0) count -= countingSort[index++];
            index--;
            return index;
        }
    }
}
