
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution{
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int rowtop = 0 , rightcol = matrix[0].length-1 , bottomrow = matrix.length-1 ;
        int leftcol = 0;
        while(ls.size()<(matrix.length*matrix[0].length)){
        for(int j = leftcol ; j<= rightcol && ls.size()<(matrix.length*matrix[0].length) ; j++){
            ls.add(matrix[rowtop][j]);

        }
            rowtop++;
        for(int i = rowtop ; i <=bottomrow && ls.size()<(matrix.length*matrix[0].length) ; i++){
            ls.add(matrix[i][rightcol]);

        }
            rightcol--;
        for(int j = rightcol ; j>=leftcol && ls.size()<(matrix.length*matrix[0].length); j-- ){
            ls.add(matrix[bottomrow][j]);

        }
            bottomrow--;
        for(int i = bottomrow ; i>=rowtop && ls.size()<(matrix.length*matrix[0].length); i--){
            ls.add(matrix[i][leftcol]);

        }
            leftcol++;


    }return ls;
    }
}
public class two2dmatrix{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int [][] arr= new int[m][n];
        for(int i = 0; i<m ; i++){
            for(int j = 0 ; j<n ; j++ ){
                int ele = in.nextInt();
                arr[i][j] = ele;
            }
        }
        List arr2 = Solution.spiralOrder(arr);
        System.out.println(arr2);
    }
}
