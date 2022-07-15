package 周赛294;

import java.text.DecimalFormat;

public class store {
    public static void main(String[] args) {

    }

    public static int minimumLines(int[][] st) {
        DecimalFormat df=new DecimalFormat("0.000000000000000000000");
        int n = st.length;
        int ans = 0;
        String k = "";
        for(int i=1;i<n;i++){
            int[] l = st[i-1];
            int[] r = st[i];
            int y = Math.abs(r[1] - l[1]);
            int x = Math.abs(r[0] - l[0]);
            String res = df.format((double) y/x);

            if(!k.equals(res)){
                ans++;
            }

            k = res;
        }

        return ans;
    }
}
