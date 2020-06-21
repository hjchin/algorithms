package implementation;

/*
An English text needs to be encrypted using the following encryption scheme.
First, the spaces are removed from the text. Let  be the length of this text.
Then, characters are written into a grid, whose rows and columns have the following constraints:

For example, the sentence , after removing spaces is  characters long.  is between  and , so it is written in the form of a grid with 7 rows and 8 columns.
 */
public class Encryption {

    public static String run(String s){
        s = s.replace(" ","");
        double sqroot = Math.sqrt(s.length());
        int rowSize = (int)Math.floor(sqroot);
        int colSize = (int)Math.ceil(sqroot);

        while((rowSize * colSize) < s.length()){
            if(rowSize != colSize){
                rowSize =  Math.max(rowSize, colSize);
            }else{
                rowSize++;
            }
            colSize = rowSize;
        }

        char[][] grid = new char[rowSize][colSize];

        int rowIndex = 0;
        int colIndex = 0;

        for(int i=0;i<s.length();i++){
            if(colIndex == colSize){
                rowIndex++;
                colIndex = 0;
            }
            grid[rowIndex][colIndex] = s.charAt(i);
            colIndex++;
        }

        StringBuilder strBuilder = new StringBuilder();
        for(int c=0;c<colSize;c++){
            for(int r=0;r<rowSize;r++){
                strBuilder.append(grid[r][c]);
            }
            strBuilder.append(" ");
        }

        return strBuilder.toString().replace("\u0000","").trim();
    }
}
