package 周赛294;

import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        System.out.println(percentageLetter("gncqrxuceivrxubvrhzlrjzokvoanotduzxastguuxfnhijraog",'e'));
    }

    public static int percentageLetter(String s, char letter) {
        int n = s.length();
        int ans = 0;
        String res;
        DecimalFormat df=new DecimalFormat("0.0000");
        for(int i=0;i<n;i++){
            if(s.charAt(i)==letter){
                ans++;
            }
        }
        res = df.format((double) ans/n);
        double d = Double.parseDouble(res);
        return (int)(d*100);
    }
}
