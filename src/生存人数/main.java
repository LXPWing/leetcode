package 生存人数;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int[] birth = {1900, 1901, 1950};
        int[] death = {1948, 1951, 2000};
        int n = birth.length;
        int[][] dp = new int[n][];
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0;i<n;i++){
            dp[i] = new int[]{birth[i],death[i]};
        }

        for(int i=0;i<n-1;i++){
            if(dp[i][1]>dp[i+1][0]){
                //System.out.println(dp[i+1][0]);
                map.put(dp[i+1][0],map.getOrDefault(dp[i+1][0],1) + 1);
            }
        }

        int res = 0;

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int k = res;
            res = Math.max(res,m.getValue());
            if(res != k){
                ans = m.getKey();
            }
        }

        System.out.println(ans);
    }
}
