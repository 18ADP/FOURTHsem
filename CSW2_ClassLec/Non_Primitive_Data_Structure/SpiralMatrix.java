//print a 2 dimensional array in spiral way in java.
package Non_Primitive_Data_Structure;
class SpiralMatrix{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int s[]=new int[25];
        int m=0,j=0,l=0,p=0;
        int y=5,x=5;

        for(int i=0;i<Math.ceil(x/2);i++){
            //Forward
            for(j=i;j<y-1;j++){
                s[m]=arr[i][j];
                m++;
               
            }
            //Downward
            for(int k=i;k<y-1;k++){
                s[m]=arr[k][j];
                m++;
            }
            //Backward
            for(l=y-1;l>i;l--){
                s[m]=arr[j][l];
                m++;
            }
            //Upward
            for(p=y-1;p>l;p--){
                s[m]=arr[p][l];
                m++;
            }
            y--;
            for(int q=0;q<25;q++){
                System.out.print(s[q]+" ");
            }
        }
        
        
    }
}
















/*
 * public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int rows = arr.length;
        int cols = arr[0].length;
        int k = 0, l = 0;
        int m = 0, n = cols - 1;
        while (k < m && l < n) {
            for (int i = l; i < n; i++) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            for (int i = k; i < m; i++) {
                System.out.print(arr[i][n] + " ");
            }
            n--;
            if (k < m) {
                for (int i = n; i >= l; i--) {
                    System.out.print(arr[m][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (int i = m; i >= k; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
        }
        System.out.println();
    }
}
 */