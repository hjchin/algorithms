package sorting;

public class Sort {

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void countingSort(int[] arr){
        int[] counting = new int[10];
        for(int i=0;i<arr.length;i++){
            counting[arr[i]]++;
        }

        for(int i=0,j=0;i<counting.length;i++){
            while(counting[i]>0){
                arr[j++] = i;
                counting[i]--;
            }
        }
    }

    public static void bubbleSort(int[] arr){
        boolean sorted=false;
        do{
            sorted = true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    sorted=false;
                }
            }
        }while(!sorted);
    }

    public static void mergeSort(int[] arr, int[] aux, int lo, int hi){
        if(lo>=hi) return;

        int mid = lo+(hi-lo)/2;
        mergeSort(arr, aux, lo, mid);
        mergeSort(arr, aux, mid+1, hi);
        merge(arr, aux, lo, mid, hi);
    }

    public static void merge(int[] arr, int[] aux, int lo, int mid, int hi){
        for(int i=lo;i<=hi;i++){
            aux[i] = arr[i];
        }

        int l=lo;
        int r=mid+1;

        for(int i=lo;i<=hi;i++){
            if(l>mid){
                arr[i] = aux[r++];
            }else if(r>hi){
                arr[i] = aux[l++];
            }else if(aux[l]<=aux[r]){
                arr[i] = aux[l++];
            }else{
                arr[i] = aux[r++];
            }
        }
    }

    public static void quicksort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        int pivot = partition(arr, lo, hi);
        quicksort(arr, lo, pivot-1);
        quicksort(arr, pivot+1, hi);
    }

    public static int partition(int[] arr, int lo, int hi){
        int i=lo;
        int j=hi;

        while(true){
            while(arr[i]<arr[lo]) if(i<hi) i++;
            while(arr[j]>arr[lo]) if(j>lo) j--;
            if(i>=j) break;
            swap(arr, i, j);
        }

        swap(arr, i, lo);
        return j;
    }

    public static void quicksort3way(int arr[], int lo, int hi){
        if(lo>=hi) return;

        int i=lo, lt=lo;
        int gt=hi;
        int p = arr[lo];

        while(i<=gt){
            if(arr[i]<p){
                swap(arr, i, lt);
                i++;
                lt++;
            }else if(arr[i]> p){
                swap(arr, i, gt);
                gt--;
            }else{
                i++;
            }
        }

        quicksort3way(arr, lo,lt-1);
        quicksort3way(arr, gt+1,hi);
    }

    public static void heapSort(int[] array){
        int N = array.length-1;
        for(int k=N/2;k>=0;k--){
            sink(array, k, N);
        }
        while(N>0){
            swap(array, 0, N--);
            sink(array, 0,N);
        }
    }

    private static void sink(int[] array, int i, int N){
        while(i*2+1<=N){
            int k = i*2+1;
            if(k<N && array[k]<array[k+1]) k++;
            if(array[k]>array[i]){
                swap(array, k, i);
                i = k;
            }else{
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static boolean less(int[] arr, int i, int j){
        return arr[i] < arr[j];
    }
}
