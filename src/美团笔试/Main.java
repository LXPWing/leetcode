package 美团笔试;

import java.util.*;

public class Main{
    public static void main(String[] args){
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        while(k-->0){
            String str = sc.next();

            if((str.charAt(0)>'Z' || str.charAt(0)<'A') && (str.charAt(0)<'a' || str.charAt(0)>'z')){
                System.out.print("Wrong");
                continue;
            }

            int n = 0;
            int m = 0;

            for(int i=1;i<str.length();i++){
                if(str.charAt(i)>='1' && str.charAt(i)<='9') n++;

                if((str.charAt(i)<='z' && str.charAt(i)>='a')
                        || (str.charAt(i)<='Z' || str.charAt(i)>='A'))m++;
            }

            if(n==0 || m==0){
                System.out.print("Wrong");
                continue;
            }

            System.out.print("Accept");
        }
    }
}