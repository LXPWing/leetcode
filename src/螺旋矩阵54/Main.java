package 螺旋矩阵54;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans = new ArrayList<>();
        int l = 0;
        int b = matrix.length - 1;
        int t = 0;
        int r = matrix[0].length - 1;
        int k = 1;
        int sum = (b+1) * (r+1);
        while(k<=sum){
            for(int i=l;i<=r && k<=sum;i++,++k) ans.add(matrix[t][i]);
            ++t;
            for(int i=t;i<=b && k<=sum;i++,++k) ans.add(matrix[i][r]);
            --r;
            for(int i=r;i>=l && k<=sum;i--,++k) ans.add(matrix[b][i]);
            --b;
            for(int i=b;i>=t && k<=sum;i--,++k) ans.add(matrix[i][l]);
            ++l;
        }

        System.out.println(ans);
    }
}
