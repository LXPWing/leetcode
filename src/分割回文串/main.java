package 分割回文串;

import java.util.ArrayList;
import java.util.List;

/**
 * 131
 * 暴力+剪条
 */
public class main {
    static List<String> path = new ArrayList<>();
    static List<List<String>> ans = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    public static boolean check(String str){
        if(str.isEmpty())return false;
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void dfs(String s, int u, String str){
        // 判断是否遍历完
        if(u == str.length()){
            if(check(s)){
                path.add(s);
                ans.add(new ArrayList<>(path));
                path.remove(path.size()-1);
            }
            return;
        }
        if(check(s)){
            path.add(s);
            dfs("",u,str);
            path.remove(path.size()-1);
        }
        dfs(s+str.charAt(u),u+1,str);
    }

    public static List<List<String>> partition(String s) {
        dfs("",0,s);
        return ans;
    }
}
