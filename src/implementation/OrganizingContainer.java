package implementation;



public class OrganizingContainer {


    public static String run(int[][] container){

        int[] rowSum = new int[container.length];
        int[] colSum = new int[container.length];

        for(int r=0;r<container.length;r++){
            for(int c=0;c<container.length;c++){
                rowSum[r] += container[r][c];
                colSum[c] += container[r][c];
            }
        }

        for(int i=0;i<rowSum.length;i++){
            boolean match = false;
            for(int j=0;j<colSum.length;j++){
                if(rowSum[i] == colSum[j]){
                    colSum[j] = -1;
                    match = true;
                    break;
                }
            }
            if(!match){
                return "Impossible";
            }
        }

        return "Possible";
    }
}
