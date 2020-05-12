package sorting;

public class MinPQ {

    private int N;
    private int[] array;

    public MinPQ(int size){
        array = new int[size+1];
    }

    public void insert(int v){
        array[++N] = v;
        swim(N);
    }

    private void swim(int i){
        while(i>1 && array[i]<array[i/2]){
            swap(i, i/2);
            i /=2;
        }
    }

    private void swap(int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public void sink(int i){
        while(i*2<=N){
            int k = i*2;
            if(k<N && array[k]>array[k+1])k++;
            if(array[k]<array[i]){
                swap(i,k);
                i = k;
            }else{
                break;
            }
        }
    }

    public int deleteMin(){
        int min = array[1];
        swap(1,N);
        sink(1);
        array[N] = 0;
        N--;
        return min;
    }

}
