package 下一个最大的元素;

import java.util.ArrayDeque;
import java.util.Deque;

public class main {

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(q.size()>0 && nums[q.peekLast()]<nums[i]){
                ans[q.peekLast()] = nums[i];
                q.pollLast();
            }
            q.offerLast(i);
        }

        for(int i=q.size()-1;i>0;i--){
            if(nums[q.pollLast()] < nums[q.peek()]){
                ans[q.pollLast()] = nums[q.peek()];
                q.pollLast();
            }
        }

        while(q.size()!=0){
            ans[q.peek()] = -1;
            q.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] k = {1,1,1,1,1};
        System.out.println(nextGreaterElements(k));
    }
}
