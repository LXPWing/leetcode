package 最小基因变化;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
    }

    public static int minMutation(String start, String end, String[] bank) {
        Set<String> str = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        Deque<String> q = new ArrayDeque<>();
        Character[] c = new Character[]{'A','C','G','T'};

        for(String b : bank){
            str.add(b);
            map.put(b,0);
        }

        q.offer(start);

        map.put(start,0);

        while(!q.isEmpty()){
            String s = q.peek();
            q.poll();

            for(int i=0;i<s.length();i++){
                String t = s;
                for(Character ch : c){
                    String st = t.substring(0,i) + ch + t.substring(i+1,s.length());
                    if(str.contains(st) && map.containsKey(st)){
                        map.put(st,map.get(t) + 1);
                        if(st.equals(end)) return map.get(st);
                        q.push(st);
                    }
                }
            }

        }

        return -1;
    }
}
