package 所有可能的路径;

import java.util.ArrayList;
import java.util.List;

public class main {
    static boolean[] t;
    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[][] test = {{1,2},{3},{3},{}};

        System.out.println(allPathsSourceTarget(test));
    }

    static public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        t = new boolean[n];

        for(int i=0;i<n;i++){
            if(t[i]==false){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                t[i] = true;
                dfs(graph,i,l);
            }
        }

        return ans;
    }

    static void dfs(int[][] g, int k, List<Integer> path){
        if(k==g.length-1){
            ans.add(new ArrayList(path));
            return;
        }

        for(int v : g[k]){
            if(t[v]==false){
                path.add(v);
                t[v]=true;
                dfs(g,v,path);
            }
        }
    }
}
