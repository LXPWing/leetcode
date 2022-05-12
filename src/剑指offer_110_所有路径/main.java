package 剑指offer_110_所有路径;

import java.util.ArrayList;
import java.util.List;

public class main {

    static List<Integer> path = new ArrayList<>();
    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(0,0,graph.length - 1,graph);
        return ans;
    }

    static void dfs(int x,int y,int t,int[][] g){
        if(g[x][y] == t){
            ans.add(new ArrayList(path));
            return;
        }

        if(x >= g.length || y >= g[x].length)return;

        for(int i = x;i<g.length;i++){
            for(int j = 0;j<g[i].length;j++){
                path.add(i+1);
                dfs(i,j,g.length-1,g);
            }
        }
    }

    public static void main(String[] args) {
        int[][] q = {{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(q));
    }
}
