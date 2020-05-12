package sorting;

public class Quick {

    static int pass = 1;

    public static void sort(char[] a){
        sort(a, 0, a.length-1);
    }

    private static void sort(char[] a , int lo, int hi){

        if(hi<=lo) {
            System.out.println("lo="+lo+",hi="+hi+" exit");
            return;
        }else{
            System.out.print("lo="+lo+", hi="+hi+", ");
        }

        System.out.print("pass "+(pass++)+": ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        int j = partition(a, lo, hi);

        System.out.print(", partition=");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(", pivot="+a[j]);


        System.out.print("sort left: j="+j+", lo="+lo+", hi="+(j-1));
        sort(a, lo, j-1);
        System.out.print("sort right: j="+j+", lo="+(j+1)+", hi="+hi);
        sort(a, j+1, hi);
    }

    private static int partition(char[] a, int lo, int hi){
        int i=lo,j=hi;
        int p=lo;

        while(true){
            while(a[i]<a[p]) if(i<hi)i++;
            while(a[j]>a[p]) if(j>lo)j--;

            if(j<=i) break;

            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        char tmp = a[p];
        a[p]=a[j];
        a[j] = tmp;

        return j;
    }

    private int compare(char a, char b){
        return Character.compare(a, b);
    }
}
