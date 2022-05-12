package 划分字母区间;

import java.util.*;

public class main {
    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij");
    }

    static public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int t = 0;
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            if(map.get(s.charAt(i))==0){
                set.remove(s.charAt(i));
            }
            if(set.size()==0){
                ans.add(i-t+1);
                t=i+1;
            }
        }

        return ans;
    }
}
