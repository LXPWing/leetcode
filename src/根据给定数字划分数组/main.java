package 根据给定数字划分数组;

import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

    }

    static int[] check(int[] nums,int k){
        int n = nums.length;
        int[] ans = new int[n];
        int l=0,r=n-1;
        for(int i=0;i<n;i++){
            ans[i] = k;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>k){
                ans[r--] = nums[i];
            }

            else if (nums[i]<k){
                ans[l++] = nums[i];
            }
        }

        for(int i=r+1,j=n-1;i<j;i++,j--){
            int c = ans[i];
            ans[i] = ans[j];
            ans[j] = c;
        }

        return ans;
    }
}
