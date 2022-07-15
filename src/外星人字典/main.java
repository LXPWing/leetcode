package 外星人字典;

public class main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "a";
        int[][] dp = new int[26][];
        dp[0] = new int[]{2, 1, 2};
        System.out.println(s.substring(1,s.length()));
        System.out.println(s.substring(1,s.length()).equals(""));
        System.out.println(dp[0][1]);
    }


}
