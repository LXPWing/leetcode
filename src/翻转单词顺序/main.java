package 翻转单词顺序;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class main {
    public static void main(String[] args) {
        String s = "  hello world!  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        int n = str.length;
        StringJoiner b = new StringJoiner(" ");
        for(int i=n-1;i>=0;i--){
            if(str[i]!=""){
                b.add(str[i]);
            }
        }

        return b.toString();
    }
}
