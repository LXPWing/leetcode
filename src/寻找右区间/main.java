package 寻找右区间;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int[] ans = findRightInterval(new int[][]{{1, 4}, {2, 3}, {3, 4}});
        for(int a : ans){
            System.out.print(a+" ");
        }
        
    }

    public static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        Map<Integer[],Integer> map = new HashMap<>();
        Integer[][] p = new Integer[n][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                p[i][j] = intervals[i][j];
            }
        }

        for(int i=0;i<n;i++){
            map.put(p[i],i);
        }

        Arrays.sort(p,(a, b) -> {
            if(a[1] == b[1])return b[0]-a[0];
            return b[1] - a[1];
        });

        for(int i=0;i<n;i++){
            int k = map.get(p[i]);
            if(i == 0) ans[k] = -1;
            else if(p[i][1] == p[i-1][1]) ans[k] = -1;
            else {
                int f = i-1;
                int h = map.get(p[i]);
                while(f >=0 && p[f][0] < p[i][1]){
                    f--;
                }
                int t = map.get(p[f]);
                ans[h] = t;
            }
        }


        return ans;
    }
}
