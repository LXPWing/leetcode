package 重新排序日志文件;

import java.util.Arrays;

public class Main {

    class path {
        String str;
        Integer index;
        public path (String str,Integer index){
            this.str = str;
            this.index = index;
        }
    }

    public static void main(String[] args) {

    }

    public String[] reorderLogFiles(String[] logs) {
        int n = logs.length;
        path[] p = new path[n];
        for(int i=0;i<n;i++){
            p[i] = new path(logs[i],i);
        }

        Arrays.sort(p,(a,b)->{
            return logCompare(a,b);
        });

        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            ans[i] = p[i].str;
        }

        return ans;
    }

    public int logCompare(path p1, path p2){
        String s1 = p1.str;
        String s2 = p2.str;
        Integer index1 = p1.index;
        Integer index2 = p2.index;

        String[] l = s1.split(" ",2);
        String[] r = s2.split(" ",2);

        boolean n = Character.isDigit(l[1].charAt(0));
        boolean m = Character.isDigit(r[1].charAt(0));

        if(n&&m){
            return index1 - index2;
        }

        if(!n && !m){
            int sc = l[1].compareTo(r[1]);
            if(sc!=0){
                return sc;
            } else {
                return l[0].compareTo(r[0]);
            }
        }

        return n ? 1:-1;
    }
}
