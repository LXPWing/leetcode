package 最小平均差;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int[] nums = new int[]{2,5,3,9,5,3};
        minimumAverageDifference(nums);
    }

    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        List<Double> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] + nums[i];
        }
        int h = n;
        for(int i=0;i<n;i++){
            double r;
            double l = Math.floor(ans[i]/(i+1));

            if(i == n-1){
                r = 0;
            } else {
                r = Math.floor((ans[n-1]-ans[i])/(n-i-1));
            }

            double k = Math.abs(l - r);
            list.add(Math.floor(k));
        }

        Double res = Double.MAX_VALUE;
        int t=0;

        for(int i=0;i<n;i++){
            if(res>list.get(i)){
                res = list.get(i);
                t = i;
            }
        }

        return t;
    }
}
