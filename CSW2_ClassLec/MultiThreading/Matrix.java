import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3,3)));
    }
    public static int[][] generateMatrix(int r ,int c){
        int[][] matrix=new int[r][c];
        Random random=new Random();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=random.nextInt()/1000;
            }
        }
        return matrix;
    }
}
/*
 * Output:
 * [[1480683, -1636398, 1186981], [-1947465, -293367, 759679], [-1575713, -1102123, -276021]]
 */
