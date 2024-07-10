package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(s));
    }

    static List<List<String>> groupAnagrams(String[] a){
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : a) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
