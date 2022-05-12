package 数组值出现一次的数;

import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    public static int[] singleNumbers(int[] nums) {
        Arrays.sort(nums);
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while(q.size()>0 && nums[q.peekLast()]==nums[i]){
                q.pollLast();
            }

            q.offerLast(i);
        }

        return q.stream().mapToInt(Integer::valueOf).toArray();
    }
}
