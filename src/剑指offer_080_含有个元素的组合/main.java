package 剑指offer_080_含有个元素的组合;

import java.util.*;

public class main {
    static Deque<Integer> q = new ArrayDeque<>();
    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        dfs(n,k,1);
        return ans;
    }

    static void dfs(int n,int k,int u){
        if(q.size()== k){
            ans.add(new ArrayList<>(q));
            return;
        }

        for(int i = u;i<=n;i++){
            q.offerLast(i);
            dfs(n,k,i+1);
            q.pollLast();
        }
    }

    public static void main(String[] args) {
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.add(0,1);
//        objects.add(0,3);
//        System.out.println(objects);

//        System.out.println(combine(4,2));
    }

}
