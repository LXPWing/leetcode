package 括号生成;

import java.util.ArrayList;
import java.util.List;

public class main {

    static List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        dfs(n,0,0,"");
        return ans;
    }

    static void dfs(int n, int l, int r, String str){

        if(l == n && r == n) ans.add(str);
        else{
            if(l < n)dfs(n,l+1,r,str+"(");
            if(r < n && r<l)dfs(n,l,r+1,str+")");
        }
    }
}
